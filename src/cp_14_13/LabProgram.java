package cp_14_13;
// File name change

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);

      String fileName = scnr.next();
      String targetLine;
      Scanner scanFile = new Scanner(new FileInputStream(fileName));
      
      while (scanFile.hasNextLine()) {
         targetLine = scanFile.nextLine();
         
         if (targetLine.contains("_photo.jpg")) {
            targetLine = targetLine.replace("_photo.jpg", "_info.txt");
            System.out.println(targetLine);
         }
         
      }
      scanFile.close();   
   }
}
