package cp_14_12;

import java.util.Scanner;
import java.util.InputMismatchException;

public class NameAgeChecker {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      String inputName;
      int age;

      inputName = scanner.next();
      while (!inputName.equals("-1")) {
         // FIXME: The following line will throw an InputMismatchException.
         //        Insert a try/catch statement to catch the exception.
         age = scanner.nextInt();
         System.out.println(inputName + " " + (age + 1));

         inputName = scanner.next();
      }
   }
}
