import java.io.Console;
import java.util.List;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Please enter a scrabble word!");
    String stringUserInput = myConsole.readLine();
    System.out.println("-------------------------------");
  Scrabble scrabble = new Scrabble();
  Integer scrabbleScore = scrabble.runScrabble(stringUserInput);
  System.out.println(scrabbleScore);

  }
}
