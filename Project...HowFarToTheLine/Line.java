import java.util.*;
class Line {
  public static void main(String[] args) {
    System.out.print("\033[H\033[2J");  
    
      try (Scanner scnr = new Scanner(System.in)) {
          double A = 0;
          double B = 0;
          double C = 0;
          double a = 0;
          double b = 0;

          System.out.println("Distance from point (a,b) to line Ax+By+C=0");

          System.out.print("What is the value of A?");
          A = scnr.nextDouble();

          System.out.print("What is the value of B?");
          B = scnr.nextDouble();

          System.out.print("What is the value of C?");
          C = scnr.nextDouble();

          System.out.print("What is the value of a?");
          a = scnr.nextDouble();

          System.out.print("What is the value of b?");
          b = scnr.nextDouble();

          System.out.println("Distance from the point ot the line is: "+(Math.abs(A*a+B*b+C)/Math.sqrt(A*A+B*B)));
    }


  }
}