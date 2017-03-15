import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Scrabble {

  public Integer runScrabble(String stringUserInput){
    String[] arrayValue1 = {"a", "e", "i", "o", "u", "l", "n", "r", "s", "t"};
    List oneValueLetter = Arrays.asList(arrayValue1);
    String[] arrayValue2 = {"d", "g"};
    List twoValueLetter = Arrays.asList(arrayValue2);
    String[] arrayValue3 = {"b", "c", "m", "p"};
    List threeValueLetter = Arrays.asList(arrayValue3);
    String[] arrayValue4 = {"f", "h", "v", "y"};
    List fourValueLetter = Arrays.asList(arrayValue4);
    String[] arrayValue5 = {"k"};
    List fiveValueLetter = Arrays.asList(arrayValue5);
    String[] arrayValue8 = {"j", "x"};
    List eightValueLetter = Arrays.asList(arrayValue8);
    String[] arrayValue10 = {"q", "z"};
    List tenValueLetter = Arrays.asList(arrayValue10);

    String[] userInput = stringUserInput.split("");
    List userWordArray = Arrays.asList(userInput);

    
    Integer score = 0;
    for (int i = 0; i < userWordArray.size(); i++)
      if (oneValueLetter.contains(userWordArray.get(i))) {
        score += 1;
      } else if (twoValueLetter.contains(userWordArray.get(i))) {
        score += 2;
      }else if (threeValueLetter.contains(userWordArray.get(i))) {
        score += 3;
      }else if (fourValueLetter.contains(userWordArray.get(i))) {
        score += 4;
      }else if (fiveValueLetter.contains(userWordArray.get(i))) {
        score += 5;
      }else if (eightValueLetter.contains(userWordArray.get(i))) {
        score += 8;
      }else{
        score += 10;
      }
      return score;
  }
}

    // String[] arrayUserInput = stringUserInput.split(" ");
    // for (int i = 0; i < arrayUserInput.length; i++) {
    //   if (arrayUserInput[i].equals(arrayValue1)) {
    //     expected += 1
    //   }
    // }

      // return expected;
//   }
// }

// take user input (e.g. word), split "word" into

// stringUserInput.split(' ')

// char[] charArray = stringUserInput.toCharArray();
// Character[] charObjectArray = ArrayUtils.toObject(charArray);
//
// for (int i = 0 ; i < stringUserInput.length(); i++){
//   if (arrayValue1.contains(stringUserInput.charAt(i))){
//     expected += 1;
//
//     for (String element : arrayUserInput)
