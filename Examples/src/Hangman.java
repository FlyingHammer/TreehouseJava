/**
 * Created by gmckay on 2/12/2016.
 * TeamTreeHouse Objects Lesson
 * Hangman Game
 */


public class Hangman {

    public static void main(String[] args) {
        Game game = new Game("treehouse");
        Prompter prompter = new Prompter(game);
        boolean isHits = prompter.PromptForGuess();
        if (isHits) {
            System.out.println("We got a hit!");
        } else {
            System.out.println("Sorry, that was a miss");
        }

    }

}

