import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.Math.*;
import java.io.*;
import java.util.*;


public class test{  
  static private final String INPUT = "C:/Users/sarth/OneDrive/Desktop/ProblemSolving/input.txt";  
  static private final String OUTPUT ="C:/Users/sarth/OneDrive/Desktop/ProblemSolving/output.txt";  
  
  public static void main(String args[]) {  
      // open I/O files  
      FileInputStream instream = null;  
      PrintStream outstream = null;  
     
      try {  
          instream = new FileInputStream(INPUT);  
          outstream = new PrintStream(new FileOutputStream(OUTPUT));  
          System.setIn(instream);  
          System.setOut(outstream);  
      } catch (Exception e) {  
          System.err.println("Error Occurred.");  
      }  
     
      Scanner in = new Scanner(System.in);  
      for (;in.hasNext();) {  
          int x = in.nextInt();  
          System.out.println(x);  
      }  
     
      // System.err.println("done.");
     
       Scanner obj = new Scanner(System.in);
        int num ;
        System.out.println("Enter number");
        num = obj.nextInt();

      return;  
  }  
  
}  
