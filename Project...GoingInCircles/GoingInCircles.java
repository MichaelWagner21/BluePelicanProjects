import java.util.*;
public class GoingInCircles {
    public static void main(String[] args){
        try (Scanner scnr = new Scanner(System.in)) {
            System.out.print("What is the area of your circle?: ");

            double area = scnr.nextDouble();

            double radius = Math.sqrt(area/Math.PI);

            System.out.println("The radius of the circle is "+radius+".");
        }
    }
}