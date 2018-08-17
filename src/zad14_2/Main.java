package zad14_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Jan","Kowalski"));
        users.add(new User("Piotr","Nowak"));
        users.add(new User("Adam","Zawadzki"));
        users.add(new User("Anna","Majewska"));

        System.out.println("Wybierz kolejność sortowania: ");

        for(SortOrder value: SortOrder.values()){
            System.out.println(value);
        }

        Scanner scan = new Scanner(System.in);

        try{
            SortOrder sortOrder = SortOrder.valueOf(scan.nextLine().toUpperCase());
            Comparator<User> comparator = sortOrder.getComparator();

            System.out.println(users);
            users.sort(comparator);
            System.out.println("Posortowana lista: "+users);

        }catch(IllegalArgumentException e){
            System.out.println("Wpisałeś niepoprawną wartość!");
        }


    }
}
