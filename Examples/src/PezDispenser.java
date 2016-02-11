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

    public void load(){
        //Setter
        mPezCount = MAX_PEZ;
    }

    // Getter
    public String getCharacterName() {

        return mCharacterName;
    }


}