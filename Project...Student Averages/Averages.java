import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
class Averages{
    public static void main(String[] args) throws Exception
  {
    // pass the path to the file as a parameter

    System.out.print("\033[H\033[2J");

    ArrayList<String> lineStrings = new ArrayList<String>();
    ArrayList<String> names = new ArrayList<String>();
    ArrayList<Double> gradeValues = new ArrayList<Double>();
    ArrayList<Double> averages = new ArrayList<Double>();
    ArrayList<Integer> zeroAdjustmentList = new ArrayList<Integer>();



    int lineLength;

    String currentLine;

    String previousChar = "";
    String currentChar;
    String nextChar = "";

    double tempNum = 0;
    double tempAve = 0;
    String tempName = "";

    File file = new File("C:\\Users\\mw057157\\Desktop\\Project...Student Averages\\StudentScores.txt.txt");
    Scanner sc = new Scanner(file);
 
    while (sc.hasNextLine()){
      String line = sc.nextLine();
      lineStrings.add(line);
    }

    for (int i = 0; i<lineStrings.size(); i++){
      zeroAdjustmentList.add(0);
      lineLength = lineStrings.get(i).length()+1;
      currentLine = lineStrings.get(i)+" ";
      for (int s = 0; s<lineLength; s++){

        if (s!=0){
          previousChar = Character.toString(currentLine.charAt(s-1));
        }
        currentChar = Character.toString(currentLine.charAt(s));

        if (s!=lineLength-1){
          nextChar = Character.toString(currentLine.charAt(s+1));
        }

        if (currentChar.equals(" ")){
          if (tempNum!=0){
            gradeValues.add(tempNum);
            tempNum = 0;
          }
        }

        if (isNum(currentChar)){

          if (Double.parseDouble(currentChar)==0){
            if (previousChar.equals(" ")){
              if (nextChar.equals(" ")){
                zeroAdjustmentList.set(i, zeroAdjustmentList.get(i)+1);
              }
            }
          }

          tempNum = (tempNum*10)+ Double.parseDouble(currentChar);
        }
        else if (currentChar.equals(" ")==false){
          tempName+=currentChar;
        }

      }

      names.add(tempName);
      tempName = "";

      tempAve = 0;
      for (int y = 0; y<gradeValues.size(); y++){
        tempAve+=gradeValues.get(y);
      }
      averages.add(tempAve/(gradeValues.size()+zeroAdjustmentList.get(i)));
      tempAve = 0;


      for (int b = 0; b<gradeValues.size(); b++){
      }
      gradeValues.clear();

    }


    for (int a = 0; a<averages.size(); a++){
      System.out.print(names.get(a));
      System.out.print(", average = ");
      System.out.println(Math.round(averages.get(a)));
    }

  }

  static boolean isNum(String x) {
    
    try {
      Double doub = Double.parseDouble(x);
      return true;
   }
   catch (NumberFormatException ex) {
      return false;
   }
    



  }
}