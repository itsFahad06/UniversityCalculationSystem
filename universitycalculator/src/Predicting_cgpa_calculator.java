import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Predicting_cgpa_calculator {

    private final Scanner input = new Scanner(System.in);

    private final int semesters_no;

    public Predicting_cgpa_calculator (int semesters_no) {this.semesters_no = semesters_no;}

    void predictor_of_cgpa_calc ()
    {
        ArrayList <Float> cgpa_predictor = new ArrayList<Float>();
        float cgpa_var;
        float by_mean = 0.0f;
        float by_median;


        for (int i = 0; i < semesters_no; i++)
        {
            System.out.println("Enter cgpa for every semester "+ (i+1));
            cgpa_var = input.nextFloat();
            cgpa_predictor.add(cgpa_var);
        }

        for (int mean = 0; mean < semesters_no; mean++)
        {
            by_mean = cgpa_predictor.get(mean) / semesters_no;
        }
        System.out.println("The prediction according to Mean is >= "+ (by_mean * 100)+"%");

        if (semesters_no % 2 == 1)
        {
            by_median = (float) (semesters_no + 1) / 2;

            Float median = cgpa_predictor.get ((int)by_median);
            System.out.println("The prediction according to Median is "+median);
        }
        else {
            by_median =(float)  ((semesters_no / 2) + ((semesters_no /2) +1)) /2;

            Float median = cgpa_predictor.get((int) by_median);
            System.out.println("The prediction according to Median is "+median+" or greater");
        }

    }

}
