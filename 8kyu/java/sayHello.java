/**
Create a method that takes as input a name, city, and state to welcome a person. Note that name will be an array consisting of one or more values that should be joined together with one space between each, and the length of the name array in test cases will vary.

Example:

['John', 'Smith'], 'Phoenix', 'Arizona'
This example will return the string Hello, John Smith! Welcome to Phoenix, Arizona!
*/

/*--- Solution ---*/
public class Hello{
  public String sayHello(String [] name, String city, String state){
    //code here
    return String.format("Hello, %s! Welcome to %s, %s!",String.join(" ",name),city,state);
  }
}

/*--- Tests ---*/
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloTest {
    
    @Test
    public void test1() throws Exception {
        Hello h = new Hello();
        String[] name = {"John", "Smith"};
        assertEquals("Hello, John Smith! Welcome to Phoenix, Arizona!",
          h.sayHello(name, "Phoenix", "Arizona"));
    }
}
