import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class ScrabbleTest {

  @Test
  public void runScrabble_returnScoreForSingleLetter_ArrayList() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.runScrabble("a"));
  }

  @Test
  public void runScrabble_returnScoreForDifferentSingleLetter_ArrayList() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 2;
    assertEquals(expected, testScrabble.runScrabble("d"));
  }

}

// @Test
// public void runScrabble_returnScoreForMultipleLetters_ArrayList(){
//   Scrabble testScrabble = new Scrabble();
//   Integer expected = 2;
//   assertEquals(expected, testScrabble.runScrabble("aa"));
//
// }
