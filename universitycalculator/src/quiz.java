import java.util.Scanner;
public class quiz {
    private final Scanner
            input = new Scanner(System.in);

    private final int number;
    public quiz(int number)
    {
        this.number = number;
    }

    float calculating_quiz ()
    {
        int total;
        float sum = 0.0f;
        float gained;
        float [] quiz_marks_obtained = new float[number];

        for (int i = 0; i < quiz_marks_obtained.length; i++)
        {
            System.out.print("Enter Marks Obtained in Quiz: "+i);
            quiz_marks_obtained[i]  = input.nextFloat();
            System.out.println();
        }

        for (float v : quiz_marks_obtained) {
            sum += v;
        }

        System.out.println("Enter total Marks");
        total = input.nextInt();

        gained = (sum / total) * 15;

        return  gained;
    }

}
