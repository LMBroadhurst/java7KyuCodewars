// Vowel Count


public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    
    String[] splitString = str.split("");
    
    for (String letter : splitString) {
      if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
        vowelsCount += 1;
      }
    }
    
    return vowelsCount;
  }
