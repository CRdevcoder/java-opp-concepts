package sortingalgorithms;
import java.util.ArrayList;
import java.lang.Comparable;

// NOTE: Sorter Interface for algorithms.
public interface Sorter {

    // Takes an ArrayList, copies it, sorts it, then returns the sorted list.
    // Accepts DataTypes that implement Comparable Interface.
    public <T extends Comparable<T>> ArrayList<T> sortList(ArrayList<T> list);

}
