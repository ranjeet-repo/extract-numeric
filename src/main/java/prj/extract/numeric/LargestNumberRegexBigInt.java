package prj.extract.numeric;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LargestNumberRegexBigInt {

  public BigInteger findLargestNumberRegexBigInt(String str) {

    String regex = "\\d+";
    Pattern ptrn = Pattern.compile(regex);
    Matcher match = ptrn.matcher(str);
    BigInteger maxNumber = BigInteger.ZERO;
    while (match.find()) {
      BigInteger num = new BigInteger(match.group());
      if (num.compareTo(maxNumber) > 0) {
        maxNumber = num;
      }
    }
    return maxNumber;
  }

}
