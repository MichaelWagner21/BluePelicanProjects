import java.util.*;
class Main {
  public static void main(String[] args) {
    String names[] = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra",
"Herman"};

   
    Arrays.sort(names);

    int maxWordLen = 7;


    for (int i =0; i<names.length; i++){
      int spaceNo = 0;
      for (int t = 0; t<maxWordLen-names[i].length(); t++){
        spaceNo++;
      }
      
      System.out.print(names[i]);

      System.out.print(" ");
      for (int s = 0; s<spaceNo; s++){
        System.out.print(" ");
      }
      System.out.println(names[names.length-(i+1)]);
    }
  }
}