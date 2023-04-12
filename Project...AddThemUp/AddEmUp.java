import java.util.Scanner;
import java.util.ArrayList;
public class AddEmUp {
    private static char[] digits = {'0','1','2','3','4','5','6','7','8','9'};
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an addition or subtraction expression of any length: "); 
            String inputString = sc.nextLine( )+"+"; //Best to store in a String and then create a new Scanner 
            
            ArrayList<Integer> numList = new ArrayList<Integer>();
            int currentNum = 0;
            int currentSign = 1;
            for (int i = 0; i<inputString.length(); i++){
                char currentChar = inputString.charAt(i);

                if (isDigit(currentChar)){
                    currentNum = (currentNum*10)+Integer.valueOf(Character.toString(currentChar));
                }
                else if (currentChar == '-'){
                    numList.add(currentNum*currentSign);
                    currentSign = -1;
                    currentNum = 0;
                }
                else if (currentChar == '+'){
                    numList.add(currentNum*currentSign);
                    currentSign = 1;
                    currentNum = 0;
                    
                }

            }
            int finalAnswer = 0;
            for (int i = 0; i<numList.size(); i++){
                finalAnswer += numList.get(i);
            }
            System.out.println(finalAnswer);
        }

    }
    public static boolean isDigit(char c){
        for (int i = 0; i<digits.length; i++){
            if (digits[i] == c){
                return true;
            }
        }
        return false;
    }
}