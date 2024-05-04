package cp_14_14;
//Parsing food data

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);

      String fileName = scnr.next();
   
      Scanner scanFile = new Scanner(new FileInputStream(fileName));
      
      String[] categories = new String[100];
      String[] names = new String[100];
      String[] descriptions = new String[100];
      String[] availabilities = new String[100];
      int i = 0;
      
      while(scanFile.hasNextLine()) {
         String line = scanFile.nextLine();
      
         int index1 = line.indexOf('\t');
         int index2 = line.indexOf('\t', index1 + 1);
         int index3 = line.indexOf('\t', index2 + 1);
         categories[i] = line.substring(0, index1);
         names[i] = line.substring(index1 + 1, index2);
         descriptions[i] = line.substring(index2 + 1, index3);
         availabilities[i] = line.substring(index3 + 1);
         i++;
         
      }
      
      scanFile.close();
      
      for (int j = 0; j < availabilities.length; j++) {
         if (availabilities[j].equals("Available")) {
            System.out.println(names[j] + " (" + categories[j] + ") -- " + descriptions[j]);
         }
      } 
     
   }
}
