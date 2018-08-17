package zad14_2;

import java.util.Comparator;

public class LastNameAscComparator implements Comparator <User> {

    @Override
    public int compare(User u1, User u2) {
        return u1.getLastName().compareTo(u2.getLastName());
    }
}
