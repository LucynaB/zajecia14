package zad14_2;

import java.util.Comparator;

public enum SortOrder {
    IMIE_ROSNACO(new FirstNamesAscComparator()),
    IMIE_MALEJACO(new FirstNameDescComparator()),
    NAZWISKO_ROSNACO(new LastNameAscComparator()),
    NAZWISKO_MALEJACO(new LastNameDescComparator());

    private final Comparator<User> comparator;

    SortOrder(Comparator<User> comparator) {

        this.comparator = comparator;
    }

    public Comparator<User> getComparator() {
        return comparator;
    }
}
