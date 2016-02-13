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

        while (dispenser.dispense() ) {
            System.out.println("Chomp Chomp");

        }

         if (dispenser.isEmpty()) {
            System.out.println("Sorry, the Pez Dispenser is now empty");
        }

        dispenser.load(4);
        dispenser.load(2);
        while (dispenser.dispense() ) {
            System.out.println("Chomp Chomp");

        }
        try {

         dispenser.load(400);
         System.out.println("This will never happen");
        } catch (IllegalArgumentException iae) {
            System.out.println("Too many PEZ!");
            System.out.printf("The error was %s\n", iae.getMessage());
        }


    }
}