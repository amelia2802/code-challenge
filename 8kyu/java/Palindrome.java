/**
Write a function that checks if a given string (case insensitive) is a palindrome.

A palindrome is a word, number, phrase, or other sequence of symbols that reads the same backwards as forwards, such as madam or racecar.
*/

/*--- Solution ---*/
public class Palindrome {
  public static Boolean isPalindrome(String x) {
    // your code here
    char modStr[] = x.toLowerCase().toCharArray();
    int i =0, j= modStr.length - 1;
    
    while(i<=j){
      if(modStr[i]!=modStr[j]){
        return false;
      }
      i++;
      j--;
    }
    
    return true;
  }
}

/*--- Tests ---*/
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Sample Tests")
class SampleTests {
  @Test
  @DisplayName("Basic tests")
  void test() {
    assertEquals(true, Palindrome.isPalindrome("a"));
    assertEquals(true, Palindrome.isPalindrome("aba"));
    assertEquals(true, Palindrome.isPalindrome("Abba"));
    assertEquals(false, Palindrome.isPalindrome("hello"));
    assertEquals(true, Palindrome.isPalindrome("Bob"));
    assertEquals(true, Palindrome.isPalindrome("Madam"));
    assertEquals(true, Palindrome.isPalindrome("AbBa"));
    assertEquals(true, Palindrome.isPalindrome(""));
  }
}
