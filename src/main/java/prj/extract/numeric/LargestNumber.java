package prj.extract.numeric;

public class LargestNumber {

  public int findLargestNumber(String str) {

    int number = 0, result = 0;
    for (int i = 0; i < str.length(); i++) {
      //If numeric value found,then convert into an integer till consecutive numeric digits
      if (Character.isDigit(str.charAt(i))) {
        number = number * 10 + (str.charAt(i) - '0');
      } else {
        result = Math.max(result, number);

        //Reset Number
        number = 0;
      }
    }
    return Math.max(result, number);
  }
}
