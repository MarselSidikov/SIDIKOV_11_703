package ru.itis;

import java.util.Comparator;

/**
 * 28.02.2018
 * ByHeightComparator
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ByHeightComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getHeight() - o2.getHeight();
    }
}
