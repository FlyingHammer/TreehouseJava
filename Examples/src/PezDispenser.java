/**
 * Created by gmckay on 2/10/2016.
 * From the Java Objects Lesson
 */
public class PezDispenser {
    public static final int MAX_PEZ = 12;
    private String mCharacterName;
    private int mPezCount;

    // Constructor
    public PezDispenser(String  characterName) {
        mCharacterName = characterName;
        mPezCount = 0;
    }

    public boolean dispense() {
        boolean wasDepensed = false;
        if (!isEmpty()) {
            mPezCount--;
            wasDepensed = true;
        }
        return wasDepensed;


    }

    // Helper Method
    public boolean isEmpty() {
        return mPezCount == 0;

    }


    public void load(){
        //Setter
        load(MAX_PEZ);
    }

    public void load(int pezAmount) {
        int newAmount = mPezCount + pezAmount;
        if (newAmount > MAX_PEZ) {
           throw new IllegalArgumentException("STOP, too Many Pez!!");
        }
        mPezCount = newAmount;
    }

    // Getter
    public String getCharacterName() {

        return mCharacterName;
    }


}