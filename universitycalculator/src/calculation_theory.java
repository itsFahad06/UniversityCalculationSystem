import java.util.Scanner;

public class calculation_theory {

    private final Scanner input = new Scanner(System.in);

    quiz q;
    Assignment a;
     float obtained_mid;
     float obtained_final;

    float total_result_theory()
    {
        int q_size,a_size;
        float total_gained_in_theory;

        System.out.println("Enter total Quiz taken ");
        q_size = input.nextInt();
        System.out.println("Enter total Assignment taken ");
        a_size = input.nextInt();

        q = new quiz(q_size);
        a = new Assignment(a_size);

        float quiz_gained = q.calculating_quiz();
        float assignment_gained = a.calculating_assignments();

        System.out.println("Enter Obtained Marks in Mid ");
        obtained_mid = input.nextFloat();
        System.out.println("Enter Obtained Marks in Final ");
        obtained_final = input.nextFloat();


        total_gained_in_theory = quiz_gained + assignment_gained + obtained_mid + obtained_final;


        return total_gained_in_theory;
    }

}
