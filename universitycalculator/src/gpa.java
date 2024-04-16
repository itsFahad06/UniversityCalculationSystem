import java.util.Scanner;

public class gpa {
    private final Scanner input = new Scanner(System.in);
    private final int subject_number;

    public gpa(int subject_number) {
        this.subject_number = subject_number;
    }

    float gpaCalc() {
        float[] gpaInSubjectEach = new float[subject_number];
        int[] creditsInEach = new int[subject_number];
        float sum = 0.0f;
        float gainedGPA;
        float gpaCalcFour = 0.0f;
        float gpaCalcThreeOrTwo = 0.0f;

        for (int i = 0; i < gpaInSubjectEach.length; i++) {
            System.out.println("Enter GPA for subject " + (i + 1) + ": ");
            gpaInSubjectEach[i] = input.nextFloat();
            System.out.println("Enter credits for subject " + (i + 1) + ": ");
            creditsInEach[i] = input.nextInt();
        }

        for (int i = 0; i < creditsInEach.length; i++) {
            if (creditsInEach[i] >= 4) {
                gpaCalcFour = (4 * gpaInSubjectEach[i]) / 4;
            } else if (creditsInEach[i] <= 3) {
                gpaCalcThreeOrTwo = (3 * gpaInSubjectEach[i] / 3);
            }
            sum += gpaCalcFour + gpaCalcThreeOrTwo;
        }

        gainedGPA = sum / subject_number;

        return gainedGPA;
    }
}