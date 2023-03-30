import java.util.Scanner; 

public class NameReversal {
    public static void main(String[] args){
        try (Scanner scnr = new Scanner(System.in)){
            System.out.println("What is your name?: ");
            String inputName = scnr.nextLine().toLowerCase();

            System.out.print("\n\n Your reversed name is: ");

            for (int i =inputName.length()-1; i>=0; i--){
                System.out.print(inputName.charAt(i));
            }
        }
    }
}