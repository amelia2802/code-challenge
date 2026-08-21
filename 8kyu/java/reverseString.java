/**
Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'
'word'   =>  'drow'

*/

/*---Solution--*/
public class Kata {

  public static String solution(String str) {
    
    char arr[]=str.toCharArray();
    int i=0;
    int j= str.length()-1;
    while(i<j){
       char temp = arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
       i++;
       j--;
    }
    return String.valueOf(arr);

  }

}

/*--- Test ---*/

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void sampleTests() {
      assertEquals("dlrow", Kata.solution("world"));
    }
}
