package sortingalgorithms.tests;

import java.util.ArrayList;
import java.util.Arrays;

import sortingalgorithms.classes.MergeSort;
import utility.classes.LetterGenerator;

public class TestMergeSort {

    public static void main(String[] args) {

        System.out.println("TESTING MERGE SORTER:");
        // Letter Generator.
        LetterGenerator gl = new LetterGenerator(90583623);
        
        MergeSort ms = new MergeSort();

        ArrayList<Character> list = gl.generateLetterList(20);

        System.out.println("Unsorted Array: " + list);

        ms.<Character>sortList(list);

        System.out.println("Sorted Array: " + list);

        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(7,1,9,3,8,2,4,5,6));
        System.out.println("Unsorted Array: " + numList);

        ms.<Integer>sortList(numList);

        System.out.println("Sorted Array: " + numList);

        System.out.println("END");





    }

}
