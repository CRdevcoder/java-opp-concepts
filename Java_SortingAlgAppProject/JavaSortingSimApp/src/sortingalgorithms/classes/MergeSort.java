package sortingalgorithms.classes;

import java.util.ArrayList;

public class MergeSort implements Sorter {

    public <T extends Comparable<T>> ArrayList<T> sortList( ArrayList<T> listArg)
    {
        // Enter first and last index of list.
        recursiveMergeSort(listArg, 0, listArg.size() - 1);
        return listArg;
    }

    private <T extends Comparable<T>> void recursiveMergeSort( ArrayList<T> a, int first, int last)
    {
        // calculate mid point.
        int mid = (first + last)/2;

        // Base case - when last index is greater than first index. 
        // (When receive single element sub array)
        if(last > first)
        {
            // Phase 1 - dividing into sub arrays
            recursiveMergeSort(a, first, mid); // leftmost sub array
            recursiveMergeSort(a, mid + 1, last); // rightmost sub array

            // Phase 2 - begin sorting subarrays by merging them together
            // Ran when recursive calls are returning
            System.out.println( "MERGE CALL: " + a + "\n first: " + first + " mid:" + mid + " last:" + last);
            merge(a,first,mid,last);
        }
        else
        {
            //System.out.println("RETURNING");
            return; // base case is met. Begin returning.
        }
    }

    // Uses midpoint parameter to divide the (a) list into 2 sub arrays.
    // Merges two adjacent sub arrays that are within the index range (first and last).
    private <T extends Comparable<T>> void merge(ArrayList<T> a, int first, int mid, int last)
    {
        System.out.println("Merging");
        int leftSubStart, leftSubEnd, rightSubStart, rightSubEnd;
        // left sub array (1st) index range.
        leftSubStart = first;
        leftSubEnd = mid;
        // right sub array (2nd) index range.
        rightSubStart = mid + 1;
        rightSubEnd = last;
        // temp ArrayList
        ArrayList<T> tempList = new ArrayList<>();

        System.out.print("Left: " + first + " - " + mid);
        System.out.println(" Right: " + rightSubStart + " - " + rightSubEnd + " length: " + a.size());
        
        // While both sub Arrays haven't been looped through fully, compare elements from both.
        // after each while loop iteration, the smaller element between sub arrays will be added to temp array.
        while( (leftSubStart <= leftSubEnd) && (rightSubStart <= rightSubEnd))
        {
            T leftItem = a.get(leftSubStart);
            T rightItem = a.get(rightSubStart);

            //System.out.println("LEFT: " + leftSubStart + " " + leftSubEnd);

            // returns negative if leftItem less than rightItem.
            if(leftItem.compareTo(rightItem) < 0)
            {
                tempList.add(leftItem); // add smaller item to list.
                leftSubStart++; // Move index foward so we don't add smaller item again.
            }
            else{ // adding to right subArray
                tempList.add(rightItem);
                rightSubStart++;
            }
        }

        System.out.println("Templist: " + tempList);

        // empty parameter arrayList, then copy temp array into it.
        for (int i = first; i < tempList.size(); i++) {
            System.out.print(i + ", ");
            a.set(i, tempList.get(first + i));
        }
        System.out.println();

        return;// FINISHED
    }

}
