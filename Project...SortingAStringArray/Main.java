import java.util.*;
class Main {
  public static void main(String[] args) {
    String names[] = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra",
"Herman"};

    Arrays.sort(names);

    for (int i =0; i<names.length; i++){
      System.out.println(names[i]);
    }
  }
}