package prj.extract.numeric;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LargestNumberTest {

  private LargestNumber number;
  private LargestNumberRegex numberRegex;

  @Before
  public void setUp() {
    number = new LargestNumber();
    numberRegex = new LargestNumberRegex();
  }

  @Test
  public void returnLargestNumberFromStringWhenStringProvided() {
    assertEquals(41, number.findLargestNumber("ebe41g5j8o2pdh5"));
    assertEquals(0, number.findLargestNumber("ebe"));
    assertEquals(7, number.findLargestNumber("g7g"));
    assertEquals(29, number.findLargestNumber("4amk7k29hkbpph8"));
    assertEquals(9, number.findLargestNumber("inke9pl5fja0mopodo3"));
    assertEquals(91, number.findLargestNumber("1j91iml54m4a1ene7cf8"));
    assertEquals(564, number.findLargestNumber("100klh564abc365bg"));
  }

  @Test
  public void returnLargestNumberFromStringWhenStringProvidedUsingRegex() {
    assertEquals(41, numberRegex.findLargestNumberRegex("ebe41g5j8o2pdh5"));
    assertEquals(0, numberRegex.findLargestNumberRegex("ebe"));
    assertEquals(7, numberRegex.findLargestNumberRegex("g7g"));
    assertEquals(29, numberRegex.findLargestNumberRegex("4amk7k29hkbpph8"));
    assertEquals(9, numberRegex.findLargestNumberRegex("inke9pl5fja0mopodo3"));
    assertEquals(91, numberRegex.findLargestNumberRegex("1j91iml54m4a1ene7cf8"));
    assertEquals(564, numberRegex.findLargestNumberRegex("100klh564abc365bg"));

  }
}
