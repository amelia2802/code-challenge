/*
    Create a function with two arguments that will return an array of the first n multiples of x.

    Assume both the given number and the number of times to count will be positive numbers greater than 0.

    Return the results as an array or list ( depending on language ).

    Examples
    x = 1, n = 10 --> [1,2,3,4,5,6,7,8,9,10]
    x = 2, n = 5  --> [2,4,6,8,10]

*/

/*---Solution--- */

import java.util.*;
public class Kata{
  public static int[] countBy(int x, int n){
    // Your code here
    int[] result = new int[n];
    
    for(int i=0;i<n;i++){
      result[i] = x * (i+1);
    }
    return result;
  }
}

/*--- Test--- */

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;

public class KataTest {
    @Test
    public void fixedTests() {
       assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, Kata.countBy(1,10));
       assertArrayEquals(new int[] {2,4,6,8,10}, Kata.countBy(2,5));
       assertArrayEquals(new int[] {3,6,9,12,15,18,21}, Kata.countBy(3,7));
       assertArrayEquals(new int[] {50,100,150,200,250}, Kata.countBy(50,5));
       assertArrayEquals(new int[] {100,200,300,400,500,600}, Kata.countBy(100,6));
    }
}
