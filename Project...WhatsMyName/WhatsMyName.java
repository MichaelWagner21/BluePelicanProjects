import java.util.Scanner;

public class WhatsMyName {
    public static void main(String[] args){
        try (Scanner scnr = new Scanner(System.in)) {
            System.out.print("What is your first name?: ");
            String firstName = scnr.next();

            System.out.print("What is your last name?: ");
            String lastName = scnr.next();

            System.out.println("Your full name is "+firstName+" "+lastName+".");
        }
    }
}