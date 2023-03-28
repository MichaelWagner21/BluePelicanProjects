import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");
        try(Scanner scnr = new Scanner(System.in)){
            while (true){
                System.out.print("Enter an integer: ");
                int input = scnr.nextInt();

            if (input%2==0){
                System.out.println(input+" is even");
            }
            else if (input%2!=0){
                System.out.println(input+" is odd.");
            }
            }
            
        }
    }
}