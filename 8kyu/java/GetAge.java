/**
  You ask a small girl "How old are you?" She always says "x years old", where x is a random number between 0 and 9.

  Write a program that returns the girl's age (0-9) as an integer.
  
  Assume the test input string is always a valid string. For example, the test input may be "1 year old" or "5 years old". The first character in the string is always a number.
*/

/*--- Solution ---*/
public class CharProblem {
  public static int howOld(final String herOld) {

  //your code here, return correct age as int ; )
    return (herOld.charAt(0) - '0');
  }
}

/*--- Test---*/

import static org.junit.Assert.*;
import org.junit.Test;

public class CharProblemTest {
    @Test
    public void test1() {
      assertEquals(5, CharProblem.howOld("5 years old"));
      }
    @Test
    public void test2() {  
      assertEquals(9, CharProblem.howOld("9 years old"));
      }
   @Test
   public void test3() {
      assertEquals(1, CharProblem.howOld("1 year old"));
      }
}
