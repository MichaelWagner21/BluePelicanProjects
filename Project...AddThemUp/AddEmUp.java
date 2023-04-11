import java.util.Scanner;
import java.util.ArrayList;
public class AddEmUp {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter something like 8 + 33 + 1,345 +137 : "); 
            String inputString = sc.nextLine( ); //Best to store in a String and then create a new Scanner 
            char[] digits = {'1','2','3','4','5','6','7',};
            ArrayList<Integer> numList = new ArrayList<Integer>();
            for (i = 0; i<inputString.length(); i++){
                currentNumber = 0;
            }
        }

    }
}