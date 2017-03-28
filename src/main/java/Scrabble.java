import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Scrabble {

  public Integer runScrabble(String stringUserInput){
    List<String> arrayValue1 = Arrays.asList("a", "e", "i", "o", "u", "l", "n", "r", "s", "t");
    List<String> arrayValue2 = Arrays.asList("d", "g");
    List<String> arrayValue3 = Arrays.asList("b", "c", "m", "p");
    List<String> arrayValue4 = Arrays.asList("f", "h", "v", "y");
    List<String> arrayValue5 = Arrays.asList("k");
    List<String> arrayValue8 = Arrays.asList("j", "x");
    List<String> arrayValue10 = Arrays.asList("q", "z");

    List<String> userWordArray = Arrays.asList(stringUserInput.toLowerCase().split(""));

    Integer score = 0;
    for (int i = 0; i < userWordArray.size(); i++)
      if (arrayValue1.contains(userWordArray.get(i))) {
        score += 1;
      } else if (arrayValue2.contains(userWordArray.get(i))) {
        score += 2;
      }else if (arrayValue3.contains(userWordArray.get(i))) {
        score += 3;
      }else if (arrayValue4.contains(userWordArray.get(i))) {
        score += 4;
      }else if (arrayValue5.contains(userWordArray.get(i))) {
        score += 5;
      }else if (arrayValue8.contains(userWordArray.get(i))) {
        score += 8;
      }else{
        score += 10;
      }
      return score;
  }
}
