import java.util.Scanner;

public class calculation_lab {
    private final Scanner input = new Scanner(System.in);

    Assignment a;
    float obtained_mid;
    float obtained_final;

    float total_result_lab()
    {
        int a_size;
        float total_gained_in_lab;


        System.out.println("Enter total Assignment taken ");
        a_size = input.nextInt();


        a = new Assignment(a_size);


        float assignment_gained = a.calculating_assignments();

        System.out.println("Enter Obtained Marks in Mid ");
        obtained_mid = input.nextFloat();
        System.out.println("Enter Obtained Marks in Final ");
        obtained_final = input.nextFloat();


        total_gained_in_lab =  assignment_gained + obtained_mid + obtained_final;


        return total_gained_in_lab;
    }
}
