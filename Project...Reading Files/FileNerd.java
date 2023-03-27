import java.io.File;
import java.util.Scanner;
class FileNerd{
    public static void main(String[] args) throws Exception
  {
    // pass the path to the file as a parameter

    System.out.print("\033[H\033[2J");


    File file = new File("C:\\Users\\mw057157\\Desktop\\Project...Reading Files\\NerdData.txt");
    Scanner sc = new Scanner(file);
 
    while (sc.hasNextLine()){
      String line = sc.nextLine();
      if ((line.charAt(0)==('T'))&&(line.charAt(1)==('h'))&&(line.charAt(2)==('e'))&&(line.charAt(3)==(' '))){
        System.out.println(line);
      }
    }
  }
}