package utility.classes;

import java.lang.reflect.Array;
import java.util.ArrayList;

import sortingalgorithms.classes.Sorter;

// STATUS: Beta 1
// TrailRound method will require changes, supposed to return Arraylist of trail time data.

// Purpose:
// Puts inputed algorithm through test trails to measure it's time complexity.
// Class that will receive a sorting algorithm object, then time it's speed.
// Uses a Sorter Object

public class SortingTimer<E extends Comparable<E>> {

    // construct it with algorithm object.
    Sorter algorithm;

    // number of tests it does per size.
    public SortingTimer(Sorter algorithm)
    {
        this.algorithm = algorithm;
    }

    // setter
    public void setAlgorithm(Sorter algorithm)
    {
        this.algorithm = algorithm;
    }
    
    // returns elapsed nanosecounds of algorithm.
    public long testTrail(ArrayList<E> list)
    {
        long startTime = System.nanoTime();

        algorithm.sortList(list);

        long endTime = System.nanoTime();

        return (endTime - startTime);
    }

    // provide arraylist and number of test trails, prints out time results.
    public long trailRound(int numTrails, ArrayList<E> list)
    {
        long averageTime = 0;
        for (int i = 0; i < numTrails; i++) {
            ArrayList<E> unsortedList = new ArrayList<>();
            unsortedList.addAll(list);
            //System.out.println(unsortedList);

            // time complextity
            long tc = testTrail(unsortedList);
            //System.out.println(unsortedList);

            averageTime =+ tc;

            System.out.println( "TRAIL " + (i + 1) + " - " + tc);
        }

        averageTime =  averageTime/numTrails;
        System.out.println("AVE TIME: " + averageTime);
        return averageTime;
    }




}
