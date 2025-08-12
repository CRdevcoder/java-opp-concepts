package utility.tests;

import java.util.ArrayList;
import sortingalgorithms.BubbleSort;
import utility.classes.LetterGenerator;
import utility.classes.SortingTimer;

public class TestSortTimer {

    public static void main(String[] args) {
        

        LetterGenerator gen1 = new LetterGenerator(17658);
        BubbleSort bubSort = new BubbleSort();
        // create list.
        ArrayList<Character> list1 = gen1.generateLetterList(20);
        System.out.println("Unsorted list :" + list1);

        SortingTimer<Character> timer = new SortingTimer<>(bubSort);
        long tcomplexity = timer.testTrail(list1);

        System.out.println("Sorted list: " + list1);

        System.out.println("TIME COMPLEXITY (nano secounds): " + tcomplexity);

        // CREATE another list.
        gen1.setSeed(198654279); // changed seed
        
        ArrayList<Character> shortList = gen1.generateLetterList(1000);
        System.out.println(shortList);
        ArrayList<Character> midList = gen1.generateLetterList(3000);
        System.out.println(midList);
        ArrayList<Character> longList = gen1.generateLetterList(5000);
        System.out.println(longList);


        System.out.println("50 elem:");
        timer.trailRound(20,shortList);
        
        System.out.println("100 elem:");

        timer.trailRound(20,midList);
                
        System.out.println("200 elem:");
        timer.trailRound(20,longList);

    }

}
