import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner kbReader = new Scanner(System.in);
        System.out.print("Enter a sentence that is to be encrypted: ");
        String sntnc = kbReader.nextLine( ); 
        System.out.println("Original sentence = " + sntnc); 

        Crypto myCryptObj = new Crypto( ); 
        String encryptdSntnc = myCryptObj.encrypt(sntnc); 
        System.out.println("Encrypted sentence = " + encryptdSntnc);

        String decryptdSntnc = myCryptObj.decrypt(encryptdSntnc); 
        System.out.println("Decrypted sentence = " + decryptdSntnc); 
    }
}

class Crypto {
    public Crypto(){
    }
    public String encrypt(String inputString){
        String returnString = "";
        for (int i = 0; i<inputString.length();i++){
            if (inputString.charAt(i) == 'g'){
                returnString=returnString+"jeb..w";
            }
            else if (inputString.charAt(i) == 'v'){
                returnString+="ag',r";
            }
            else if (inputString.charAt(i) == 'm'){
                returnString+="ssad";
            }
            else if (inputString.charAt(i) == 'b'){
                returnString+="dug>?/";
            }
            else if (inputString.charAt(i) == 'g'){
                returnString+="jeb..w";
            }
            else {
                returnString+=inputString.charAt(i);
            }
        }
        return returnString;
    }
    public String decrypt(String inputString){
        String returnString = inputString.replace("ag',r","v");
        returnString = returnString.replace("ssad","m");
        returnString = returnString.replace("jeb..w","g");
        returnString = returnString.replace("dug>?/","b");
        return returnString;
    }
}