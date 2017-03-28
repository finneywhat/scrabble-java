import java.io.Console;
import java.util.List;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    boolean programRunning = true;
    while (programRunning) {
    System.out.println("-----------------------------------\nPlayer 1, please enter a scrabble word!");
    System.out.println("-----------------------------------");
    String playerOneInput = myConsole.readLine();
    Scrabble scrabbleOne = new Scrabble();
    Integer playerOneScore = scrabbleOne.runScrabble(playerOneInput);
    System.out.println("-----------------------------------\nPlayer 2, please enter a scrabble word!");
    System.out.println("-----------------------------------");
    String playerTwoInput = myConsole.readLine();
    Scrabble scrabbleTwo = new Scrabble();
    Integer playerTwoScore = scrabbleTwo.runScrabble(playerTwoInput);
    System.out.println("\n...................................");
    System.out.println("\nSCOREBOARD:\n\nPlayer 1 scored " + playerOneScore + " points for the word '" + playerOneInput + "'.\n\nPlayer 2 scored " + playerTwoScore + " points for the word '" + playerTwoInput + "'.");
    System.out.println("...................................\n\n");
    System.out.println("<><><><><><><><><><><><><><><><><><>");
      if (playerOneScore > playerTwoScore) {
        System.out.println("Player 1 is the winner!");
      } else if (playerTwoScore > playerOneScore) {
        System.out.println("Player 2 is the winner!");
      } else {
        System.out.println("Looks like we have a tie. Of course you have to play again to settle this score!");
      }
    System.out.println("<><><><><><><><><><><><><><><><><><>");
    System.out.println("\nPlay again? Please enter yes or no.");
    String playAgain = myConsole.readLine().toLowerCase();
      if (playAgain.startsWith("y")) {
        programRunning = true;
      } else if (playAgain.startsWith("n")) {
        programRunning = false;
      }
    }
  }
}
