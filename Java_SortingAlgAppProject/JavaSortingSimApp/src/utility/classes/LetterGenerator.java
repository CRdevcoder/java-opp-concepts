package utility.classes;
import java.util.ArrayList;
import java.util.Random;

// Note: ASCII number values of capital letters are 65(A) to 90(Z).

public class LetterGenerator {

    private Random ranGen;
    private int seed;

    public final int FIRSTLETTER = 65;
    public final int LASTLETTER = 90;

    // The range of letters that will be generated. 
    private int genStartLet;
    private int genEndLet;

    // Constructor
    public LetterGenerator(int seed)
    {
        this.seed = seed;
        // creates ranGen using given seed
        this.ranGen = new Random(seed);
        // default letter range.
        genStartLet = FIRSTLETTER;
        genEndLet = LASTLETTER;
    }

    // Getter and Setter methods
    public int getSeed()
    {
        return seed;
    }

    public void setSeed(int seed)
    {
        this.seed = seed;
        ranGen.setSeed(seed);
    }

    // NOTE: add exception for non letter characters.
    // if (min < LASTLETTER || max > FIRSTLETTER) then throw exception.
    public void setRange(Character min, Character max)
    {
        // convert character args into ascii code.
        this.genStartLet = (int)min;
        this.genEndLet = (int)max;
    }


    // Get Random number within specific range.
    private int getRanNum(int min, int max)
    {
        return ranGen.nextInt((max - min) + 1) + min;
    }

    // Get Random Letter using ranGen
    public Character nextChar()
    {
        int asciiValue  = getRanNum(genStartLet,genEndLet);
        Character let = (Character)((char)asciiValue); // convert from primitive int, to char, to Wrapper class Character.
        return let;
    }

    // Method generates an ArrayList of random letters with specified size. 
    public ArrayList<Character> generateLetterList(int size)
    {
        ArrayList<Character> list = new ArrayList<>();

        for(int i = 0; i < size; i++)
        {
            list.add(nextChar());
        }
        return list;
    }


}
