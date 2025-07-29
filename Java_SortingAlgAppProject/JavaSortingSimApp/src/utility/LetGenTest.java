package utility;

import java.util.ArrayList;

public class LetGenTest {

    public static ArrayList<Character> genList(LetterGenerator gen, int size)
    {
            ArrayList<Character> list = gen.generateLetterList(size);
            System.out.println(list);
            return list;
    }

    // Testing the LetterGenerator Class.
    public static void main(String[] args) {
        
        System.out.println("TESTING LETTERGENERATOR CLASS:");

        LetterGenerator generator = new LetterGenerator(2516);
        ArrayList<Character> list;

        list = generator.generateLetterList(25);

        System.out.println(list);

        generator.setSeed(9457);

        list = generator.generateLetterList(25);

        System.out.println(list);

        // set new letter range
        System.out.println("From A to E:");
        generator.setRange('A', 'E');

        list = genList(generator,25);

        generator.setSeed(493652);
        genList(generator,25);

        System.out.println("From F to K:");
        generator.setRange('F', 'K');
        generator.setSeed(786695);
        genList(generator,25);
        generator.setSeed(2315433);
        genList(generator,25);
        
    }

}
