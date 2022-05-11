// Highest and Lowest

public class Kata {
  public static String highAndLow(String numbers) {
    
    String[] splitNumbStrings = numbers.split(" ");
    int[] splitNumbInts = new int [splitNumbStrings.length];

    for (int i = 0; i < splitNumbStrings.length; i++) {
        splitNumbInts[i] = Integer.parseInt(splitNumbStrings[i]);
    }

    int lowest = splitNumbInts[0];
    int highest = splitNumbInts[0];


    for (int i = 1; i < splitNumbInts.length; i++) {
        if (splitNumbInts[i] > highest) {
            highest = splitNumbInts[i];
        } else if (splitNumbInts[i] < lowest) {
            lowest = splitNumbInts[i];
        }
    }

    return Integer.toString(highest) + " " + Integer.toString(lowest);
    
  }
}
