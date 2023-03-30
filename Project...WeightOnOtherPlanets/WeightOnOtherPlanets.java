import java.util.Scanner;

public class WeightOnOtherPlanets {
    public static void main(String[] args){
        try(Scanner scnr = new Scanner(System.in)){
            System.out.print("What is your weight?: ");
            int weight = scnr.nextInt();
            System.out.println("\n1. Voltar \n2. Krypton \n3. Fertos \n4. Servontos");
            System.out.print("Your Choice?: ");
            int choice = scnr.nextInt();
            switch(choice){
                case 1:
                    System.out.println("\nYour Weight on Voltar is "+(double)(weight*0.091));
                    break;
                case 2:
                    System.out.println("\nYour Weight on Krypton is "+(double)(weight*0.720));
                    break;
                case 3: 
                    System.out.println("\nYour Weight on Fertos is "+(double)(weight*0.865));
                    break;
                case 4:
                    System.out.println("\nYour Weight on Servontos is "+(double)(weight*4.612));
                    break;
            }
        }
    }
}