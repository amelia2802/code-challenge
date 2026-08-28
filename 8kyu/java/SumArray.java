/**
Write a function that takes an array of numbers and returns the sum of the numbers. The numbers can be negative. If the array is empty, return 0.

Examples
Input: [1, 5.2, 4, 0, -1]
Output: 9.2

Input: [-2.398]
Output: -2.398

Input: []
Output: 0

Assumptions
You can assume that you are given a (possibly empty) valid array containing only numbers.
What We're Testing
We're testing basic loops and math operations. This is for beginners who are just learning loops and math operations.
Advanced users may find this extremely easy and can easily write this in one line.

*/

/*--- Solution ---*/
public class SumArray {

  public static double sum(double[] numbers) {
    double sum = 0;
    
    for(int i=0;i<numbers.length;i++){
      sum+= numbers[i];
    }
    
    return sum;
  }
}

/*--- Tests ---*/
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SumArrayTest {

  @Test
  public void testSum() {
    assertEquals(0,      SumArray.sum(new double[] { }),                1e-4);
    assertEquals(-2.398, SumArray.sum(new double[] {-2.398}),           1e-4);
    assertEquals(6,      SumArray.sum(new double[] {1, 2, 3}),          1e-4);
    assertEquals(6.6,    SumArray.sum(new double[] {1.1, 2.2, 3.3}),    1e-4);
    assertEquals(9.2,    SumArray.sum(new double[] {1, 5.2, 4, 0, -1}), 1e-4);
    assertEquals(320,    SumArray.sum(new double[] {30, 89, 100, 101}), 1e-4);
  }
}
