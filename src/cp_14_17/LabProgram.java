package cp_14_17;
// Exceptions with arrays

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String[] names = { "Ryley", "Edan", "Reagan", "Henry", "Caius", "Jane", "Guto", "Sonya", "Tyrese", "Johnny" };
      int index;

		index = scnr.nextInt();
      try {
         System.out.println("Name: " + names[index]);
      }
      catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Exception! " + e.getMessage());
         if (index < 0) {
            System.out.println("The closest name is: " + names[0]);
         }
         else {
            System.out.println("The closest name is: " + names[names.length - 1]);
         }
      }
   }
}
