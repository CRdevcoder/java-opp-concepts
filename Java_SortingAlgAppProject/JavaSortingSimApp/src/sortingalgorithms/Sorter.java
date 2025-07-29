package sortingalgorithms;
import java.util.ArrayList;
import java.lang.Comparable;

public abstract class Sorter {

    // Takes an ArrayList, copies it, sorts it, then returns the sorted list.
    public abstract <T extends Comparable<T>> ArrayList<T> sortList(ArrayList<T> list);

}
