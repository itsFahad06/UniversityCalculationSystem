import java.util.Scanner;

public class cgpa {

    private final Scanner input = new Scanner(System.in);
    private final int number_of_semester;
    public cgpa(int number_of_semester)
    {
        this.number_of_semester = number_of_semester;
    }

    float cgpa_calc()
    {
        float [] gpa_of_each_semester = new float[number_of_semester];
        float sum = 0.0f;
        float gained_cgpa;

        for (int i = 0; i < gpa_of_each_semester.length; i++)
        {
            System.out.println("Enter Gpa of Semester "+i);
            gpa_of_each_semester [i] = input.nextFloat();
        }

        for (float v: gpa_of_each_semester)
        {
            sum += v;
        }

        gained_cgpa = sum / number_of_semester;

        return gained_cgpa;
    }
}
