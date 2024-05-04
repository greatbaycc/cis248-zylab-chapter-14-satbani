import java.util.Scanner;
import java.util.NoSuchElementException;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int val1;
      int val2;
      int val3;
      int max;
      
      val1 = 0;
      val2 = 0;
      val3 = 0;
      
      int counter = 0;
      
      try {
         val1 = scnr.nextInt();
         counter++;
         val2 = scnr.nextInt();
         counter++;
         val3 = scnr.nextInt();
         counter++;
         
         if (val1 > val2) {
            if (val1 > val3) {
               max = val1;
            }
            else {
               max = val3;
            }
         }
         else {
            if (val2 > val3) {
               max = val2;
            }
            else {
               max = val3;
            }
         }
         System.out.println(max);
      }
      catch (NoSuchElementException e) {
         System.out.println(counter + " input(s) read:");
         if (counter > 1) {
            if (val1 > val2) {
               System.out.println("Max is " + val1);
            }
            else {
               System.out.println("Max is " + val2);
            }
         }
         else if (counter > 0) {
            System.out.println("Max is " + val1);
         }
         else {
            System.out.println("No max");
         }
      
      }
      
   }
}
