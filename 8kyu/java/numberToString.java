/**
 *  Convert a Number to a String!
 *  We need a function that can transform a number (integer) into a string.

    What ways of achieving this do you know?

    Examples (input --> output):
    123  --> "123"
    999  --> "999"
    -100 --> "-100"
 */

/* Solution */
class Kata {
  public static String numberToString(int num) {
    
    //for java you have mention Integer.toString() instead of .toString()
    return Integer.toString(num); // Return a string of the number here!
  }
}

/* Sample Tests */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberStringExampleTests {
  @Test
  public void tests() {
    assertEquals("67", Kata.numberToString(67));
    assertEquals("123", Kata.numberToString(123));
    assertEquals("999", Kata.numberToString(999));
    assertEquals("0", Kata.numberToString(0));
  }
}

