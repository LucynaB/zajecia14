package zad14_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu[] menuValues = Menu.values();
        Scanner scan = new Scanner(System.in);
        Menu userChoice = null;

        do {
            try {
                System.out.println("Wybierz opcję: ");
                for (Menu menuValue : menuValues) {
                    System.out.println(menuValue);
                }

                userChoice = Menu.valueOf(scan.nextLine().toUpperCase());

                if(!userChoice.equals(Menu.KONIEC)){
                    System.out.println("Wybrałeś opcję: " + userChoice);
                }else{
                    System.out.println("Zakończono");
                    break;
                }


            } catch (IllegalArgumentException e) {
                System.out.println("Wybrałeś niepoprawną wartość!");

            }
        } while (userChoice == null);





    }
}
