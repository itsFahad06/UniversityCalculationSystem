import java.util.Scanner;

public class Aggregate_Calculator {

    private final Scanner input = new Scanner(System.in);

    float aggregate_calc ()
    {
        float matric_obtained;
        float fsc_obtained;
        float nts_obtained;
        float gained;

        System.out.println("Enter Matric Marks Obtained");
        matric_obtained = input.nextFloat();

        System.out.println("Enter Fsc Marks Obtained");
        fsc_obtained = input.nextFloat();

        System.out.println("Enter NTS Marks Obtained");
        nts_obtained =input.nextFloat();

        gained = ((matric_obtained / 1100) * 10) + ((fsc_obtained / 1100) * 40) + ((nts_obtained / 100) * 50);

        return gained;
    }
}
