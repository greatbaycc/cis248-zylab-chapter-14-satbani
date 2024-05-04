package cp_14_16;
// Step counter - exceptions

import java.util.Scanner;

public class LabProgram {
   /* Define your method here */
   public static double stepsToMiles(int steps) throws Exception {
      if (steps < 0) {
         throw new Exception("Exception: Negative step count entered.");
      }
      return (double) steps/2000;
   }
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      try {
         int numSteps = scnr.nextInt();
         double numMiles = stepsToMiles(numSteps);
      
         System.out.printf("%.2f", numMiles);
         System.out.println();
      }
      catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }
}
