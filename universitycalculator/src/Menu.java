import java.util.Scanner;

public class Menu {
   private final Scanner input = new Scanner(System.in);

   calculation_theory ct;
   calculation_lab cb;
   cgpa cgp;
   gpa gp;
   Grades_calculation gc;
   Predicting_cgpa_calculator pcc;
   Aggregate_Calculator ac;
   void menu()
   {
       String choice_of_calc;
       int choice;

       System.out.println("1- Cgpa ");
       System.out.println("2- Gpa ");
       System.out.println("3- Gained Marks in a Subject ");
       System.out.println("4- Grade Finder ");
       System.out.println("5- Make a prediction on cgpa [Through Different Means]");
       System.out.println("6- Admission Aggregate Calculation");

       choice = input.nextInt();

       switch (choice)
       {
           case 1 -> {
               System.out.println("Enter Semesters Number ");
               int semester_num = input.nextInt();

               cgp = new cgpa(semester_num);
               float result_of_cgpa = cgp.cgpa_calc();
               System.out.print("The Cgpa after "+ semester_num + " semesters are: "+result_of_cgpa);
           }
           case 2 -> {
               System.out.println("Enter Subject Number ");
               int subjects_num = input.nextInt();

               gp = new gpa(subjects_num);

               float gpa_gained = gp.gpaCalc();
               System.out.println("The gpa in this Semester is: "+ gpa_gained);
           }

           case 3 -> {
               System.out.println("Calculate for theory or lab or both ");
               input.nextLine();
               choice_of_calc = input.nextLine();

               if(choice_of_calc.equalsIgnoreCase("theory") || choice_of_calc.equalsIgnoreCase("Lab") || choice_of_calc.equalsIgnoreCase("Both"))
               {

                   switch (choice_of_calc)
                   {
                       case "theory","Theory" -> {
                           ct = new calculation_theory();
                           float result = ct.total_result_theory();
                           System.out.println("Total Marks Obtained In theory is : "+result);
                       }

                       case "Lab","lab" -> {
                           cb = new calculation_lab();
                           float result = cb.total_result_lab();
                           System.out.println("Total Marks Obtained In Lab is : "+result);
                       }

                       case "both","Both" -> {
                           System.out.println("Calculating Theory First and then Lab ");
                           ct = new calculation_theory();
                           cb = new calculation_lab();

                           float ct_res = ct.total_result_theory();
                           float cb_res = cb.total_result_lab();

                           float total_obtained = (ct_res /100) * 75 + (cb_res / 100) * 25;

                           System.out.println("The total Marks you have gained are : "+total_obtained);
                       }
                   }
               }
           }
           case 4 -> {
               String old_or_new_type;
               input.nextLine();
               System.out.println("Enter Your Grade System is it new or old ? [new for Fa21 > or old for Fa21 <] ");
               old_or_new_type = input.nextLine();

               gc = new Grades_calculation(old_or_new_type);

               gc.grade_calc();
           }

           case 5 -> {
               System.out.println("Enter Semesters Number ");
               int semester_num = input.nextInt();

               pcc = new Predicting_cgpa_calculator(semester_num);

               pcc.predictor_of_cgpa_calc();
           }
           case 6 -> {
               ac = new Aggregate_Calculator();

               float gained_agr = ac.aggregate_calc();
               System.out.println("The gained Aggregate is "+gained_agr);

               if (gained_agr < 50 && gained_agr >0)
               {
                   System.out.println("Failed Can't Apply! Next Time");
               }
               else if (gained_agr >= 50 && gained_agr <= 70)
               {
                   System.out.println("Good Aggregate But Only Non-Engineering Allowed [SE,CS,BBA,Math,English] etc]");
               }
               else if (gained_agr > 70 && gained_agr <=100)
               {
                   System.out.println("Excellent Aggregate Allowed In All Fields");
               }
           }

       }


   }
}
