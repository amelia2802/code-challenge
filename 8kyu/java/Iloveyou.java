/**
Who remembers back to their time in the schoolyard, when girls would take a flower and tear its petals, saying each of the following phrases each time a petal was torn:

"I love you"
"a little"
"a lot"
"passionately"
"madly"
"not at all"
If there are more than 6 petals, you start over with "I love you" for 7 petals, "a little" for 8 petals and so on.

When the last petal was torn there were cries of excitement, dreams, surging thoughts and emotions.

Your goal in this kata is to determine which phrase the girls would say at the last petal for a flower of a given number of petals. The number of petals is always greater than 0.
*/

/*--- Solution ---*/
public class Sid {
    public static String howMuchILoveYou(int nb_petals) {
      
      //cycle the value in the array
      //use the remainder when dividing by 6
      //Java arrays start at index 0, while your petals start at 1
      //return the last element
    
      //your code here :)
      String[] msg = {"I love you","a little","a lot","passionately","madly","not at all"};
      return msg[(nb_petals -1)%6];
    }
}

/*--- Test ---*/
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Random;

public class SampleTests {
    @Test
    public void test1() {
        assertEquals("I love you", Sid.howMuchILoveYou(1));
        assertEquals("a little", Sid.howMuchILoveYou(2));
        assertEquals("not at all", Sid.howMuchILoveYou(6));
    }
}
