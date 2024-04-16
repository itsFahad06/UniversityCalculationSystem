import java.util.Scanner;

public class Grades_calculation {

    private final Scanner input = new Scanner(System.in);

    private final String old_or_new;

    public Grades_calculation(String old_or_new)
    {
        this.old_or_new = old_or_new;
    }

    void grade_calc()
    {
        int subject_marks;
        System.out.println("Enter Your Marks in the following Subject? ");
        subject_marks = input.nextInt();

        if (old_or_new.equalsIgnoreCase("Old") || old_or_new.equalsIgnoreCase("New"))
        {
            switch (old_or_new)
            {
                case "old","Old" -> {
                        if (subject_marks >= 90 && subject_marks <= 100)
                        {
                            System.out.println("Your Grade is A and gpa is 4.0");
                        } else if (subject_marks <= 90 && subject_marks >= 85) {
                            System.out.println("Your Grade is A- and gpa is 3.7");
                        } else if (subject_marks >= 80 && subject_marks <=84) {
                            System.out.println("Your Grade is B+ and gpa is 3.3");
                        } else if (subject_marks >=75 && subject_marks <=79) {
                            System.out.println("Your Grade is B and gpa is 3.0");
                        } else if (subject_marks >=70 && subject_marks <=74) {
                            System.out.println("Your Grade is B- and gpa is 2.7");
                        } else if (subject_marks >=65 && subject_marks <=69) {
                            System.out.println("Your Grade is C+ and gpa is 2.3");
                        } else if (subject_marks >=60 && subject_marks <=64) {
                            System.out.println("Your Grade is C and gpa is 2.0");
                        } else if (subject_marks >=55 && subject_marks <=59) {
                            System.out.println("Your Grade is C- and gpa is 1.7");
                        } else if (subject_marks >=50 && subject_marks <=54) {
                            System.out.println("Your Grade is D+ and gpa is 1.3");
                        } else {
                            System.out.println("You are Failed Sorry! Grade is F and gpa is 0.0");
                        }

                }
                case "new","New" -> {
                        if (subject_marks >= 85 && subject_marks <= 100 )
                        {
                            System.out.println("Your Grade is A and cgpa is 4.0");
                        } else if (subject_marks >= 80 && subject_marks <= 84) {
                            System.out.println("Your Grade is A- and cgpa is 3.44-3.66");
                        } else if (subject_marks >= 75 && subject_marks <= 79) {
                            System.out.println("Your Grade is B+ and cgpa is 3.01-3.33");
                        } else if (subject_marks >= 71 && subject_marks <= 74) {
                            System.out.println("Your Grade is B and cgpa is 2.67-3.0");
                        } else if (subject_marks >= 68 && subject_marks <= 70) {
                            System.out.println("Your Grade is B- and cgpa is 2.34-2.66");
                        } else if (subject_marks >= 64 && subject_marks <= 67) {
                            System.out.println("Your Grade is C+ and cgpa is 2.01-2.33");
                        } else if (subject_marks >= 61 && subject_marks <= 63) {
                            System.out.println("Your Grade is C and cgpa is 1.67-2.0");
                        } else if (subject_marks >= 58 && subject_marks <= 60) {
                            System.out.println("Your Grade is C- and cgpa is 1.31-1.66");
                        } else if (subject_marks >=54 && subject_marks <= 57) {
                            System.out.println("Your Grade is D+ and cgpa is 1.01-1.30");
                        } else if (subject_marks >=50 && subject_marks <=53) {
                            System.out.println("Your Grade is D and cgpa is 0.10-1.00");
                        } else {
                            System.out.println("You are Failed Sorry! Grade is F and cgpa is 0.0");
                        }
                }
            }
        }
    }

}
