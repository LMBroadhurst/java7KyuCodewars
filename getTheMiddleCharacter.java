// Get the Middle Character

class Kata {
    public static String getMiddle(String word) {
//     Work out if the word is an odd or even number of chars
        int oddEven = word.length();

//     If odd, need the middle letter.

        if (oddEven % 2 != 0) {
            int index = (oddEven / 2);
            return String.valueOf(word.charAt(index));
        }
      
//       If even, need the two middle letters.
      
      if (oddEven % 2 == 0) {
          int mid1 = (oddEven / 2) - 1;
          int mid2 = (oddEven / 2);
          return String.valueOf(word.charAt(mid1)) + String.valueOf(word.charAt(mid2));
      }
        
        return "";
    }
}
