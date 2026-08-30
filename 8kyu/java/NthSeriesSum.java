/**
Your task is to write a function which returns the n-th term of the following series, which is the sum of the first n terms of the sequence (n is the input parameter).

S
e
r
i
e
s
:
1
+
1
4
+
1
7
+
1
10
+
1
13
+
1
16
+
…
Series:1+ 
4
1
​
 + 
7
1
​
 + 
10
1
​
 + 
13
1
​
 + 
16
1
​
 +…
You will need to figure out the rule of the series to complete this.

Rules
You need to round the answer to 2 decimal places and return it as String.

If the given value is 0 then it should return "0.00".

You will only be given Natural Numbers as arguments.

Examples (Input --> Output)
n
1 --> 1 --> "1.00"
2 --> 1 + 1/4 --> "1.25"
5 --> 1 + 1/4 + 1/7 + 1/10 + 1/13 --> "1.57"
*/
/*--- Solution ---*/
public class NthSeries {
	public static String seriesSum(int n) {
		// Happy Coding ^_^
      /*
        formula: 1/{(3*i)-2}
      */
    
    double sum = 0;
    
    for(int i=1;i<=n;i++){
      sum+= 1.0/((3*i)-2);
    }
    
    return String.format("%.2f",sum);
	}
}
/* --- Test --- */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NthSeriesTest {
	@Test
	public void sampleTests() {
		doTest( 0, "0.00");
		doTest( 5, "1.57");
		doTest( 9, "1.77");
		doTest(15, "1.94");
		doTest(39, "2.26");
		doTest(58, "2.40");
	}
    private static void doTest(int n, String expected) {
        String message = "n = " + n + "\n";
        String actual = NthSeries.seriesSum(n);
        assertEquals(expected, actual, message);
    }
}
