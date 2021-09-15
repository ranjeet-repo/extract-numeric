package prj.extract.numeric;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LargestNumberRegex {

  public int findLargestNumberRegex(String str) {

    String regex = "\\d+";
    Pattern ptrn = Pattern.compile(regex);
    Matcher match = ptrn.matcher(str);
    int maxNumber = 0;
    while (match.find()) {
      int number = Integer.parseInt(match.group());
      if (number > maxNumber) {
        maxNumber = number;
      }
    }
    return maxNumber;
  }

}
