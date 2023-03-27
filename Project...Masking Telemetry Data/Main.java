import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

class Main {
    public static void main(String[] args) throws Exception{
        
        
        System.out.print("\033[H\033[2J");
        
        
        ArrayList<Integer> dataInputs = new ArrayList<Integer>();

        File file = new File("C:\\Users\\mw057157\\Desktop\\Project...Masking Telemetry Data\\Switches.txt");
        
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()){
            String line = sc.nextLine();
            int numInput = (int) Double.parseDouble(line);
            dataInputs.add(numInput);
          }
        


        sc.close();

        for (int s = 0; s<dataInputs.size(); s++){
            printStatus(dataInputs.get(s));
        }
        
        
        

    }

    static void printStatus(int input){
        System.out.println();
        System.out.print("Switch status for data value "+input+":");
        System.out.println();

        int bitNum = 0;

        for (int i = 0; i<8; i++){
            bitNum = (int) Math.pow(2,i);
            if ((input & bitNum) == bitNum){
                System.out.println("   Switch sw"+(i+56)+" is \"on\"");
            }
            else {
                System.out.println("   Switch sw"+(i+56)+" is \"off\"");
            }
        }
        
    }
}