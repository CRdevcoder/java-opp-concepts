package sortingalgorithms;
import java.util.ArrayList;
import java.lang.Comparable;

// NOTE: better to convert into interface?
public abstract class Sorter {

    // Takes an ArrayList, copies it, sorts it, then returns the sorted list.
    // Accepts DataTypes that implement Comparable Interface.
    public abstract <T extends Comparable<T>> ArrayList<T> sortList(ArrayList<T> list);

}
