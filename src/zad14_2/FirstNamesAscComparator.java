package zad14_2;

import java.util.Comparator;

public class FirstNamesAscComparator  implements Comparator<User> {

    @Override
    public int compare(User u1, User u2) {
        return u1.getFirstName().compareTo(u2.getFirstName());
    }
}
