/**
Your task is to write a function which returns the time since midnight in milliseconds.

Example:
h = 0
m = 1
s = 1

result = 61000
Input constraints:

0 <= h <= 23
0 <= m <= 59
0 <= s <= 59
*/

/*--- Solution ---*/
public class Clock
{
  public static int Past(int h, int m, int s) 
  {
    //Happy Coding! ^_^
    /*
      Seconds: Seconds × 1,000
      Minutes: Minutes × 60,000 (since 60 s × 1,000 ms)
      Hours: Hours × 3,600,000 (since 60 min × 60,000 ms)
      Days: Days × 86,400,000 (since 24 hours × 3,600,000 ms
    */
    return ((h*3600000)+(m*60000)+(s*1000));
  }
}

/*--- Test ---*/
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ClockTest {
    @Test    
    public void test1(){

    assertEquals(61000, Clock.Past(0,1,1));
    }

  
}
