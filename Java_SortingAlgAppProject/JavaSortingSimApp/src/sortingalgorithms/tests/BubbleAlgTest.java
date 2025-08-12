package sortingalgorithms.tests;

import java.util.ArrayList;
import sortingalgorithms.BubbleSort;
import utility.classes.LetterGenerator;

// Tests the BubbleSort class
public class BubbleAlgTest {

    public static void main(String[] args) {

        BubbleSort bsort = new BubbleSort();
        LetterGenerator generator = new LetterGenerator(3426);
        generator.setRange('A', 'C');

        ArrayList<Character> ranList = generator.generateLetterList(10);

        System.out.println("Bubble Sorting List:\n" + ranList);

        bsort.sortList(ranList); // sorts list

        // Another Letter list:
        generator.setRange('A', 'H');
        ranList = generator.generateLetterList(10);
        System.out.println("2nd Bubble Sorting List:\n" + ranList);

        bsort.sortList(ranList);


        System.out.println("SORTED LETTER LIST:\n" + ranList + "\n");

        int[] nums = {7,1,9,3,8,2,4,5,6};
        ArrayList<Integer> numList = new ArrayList<>();
        for (int n : nums) {
            numList.add((Integer)n);
        }

        System.out.println("UNSORTED NUMBER LIST:\n" + numList + "\n");

        bsort.sortList(numList);

    }

}
