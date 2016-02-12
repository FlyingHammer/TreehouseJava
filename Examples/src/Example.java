/**
 * Created by gmckay on 2/10/2016.
 * From Java Objects Lesson
 */
public class Example {

    public static void main(String[] args) {
        // Your amazing code goes here...

        System.out.println("We are making a new Pez Dispenser,");
        PezDispenser dispenser = new PezDispenser("Yoda");

        System.out.printf("The Dispenser character is %s\n", dispenser.getCharacterName());

        if (dispenser.isEmpty()) {
            System.out.println("It is currently empty ");
        }

        System.out.println("Loading...");
        dispenser.load();
        if (!dispenser.isEmpty()) {
            System.out.println("Its no longer empty");
        }

    }
}