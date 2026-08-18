/**
 *  Convert a Number to a String!
 *  We need a function that can transform a number (integer) into a string.

    What ways of achieving this do you know?

    Examples (input --> output):
    123  --> "123"
    999  --> "999"
    -100 --> "-100"
 */


/*---- Solution ----*/

function numberToString(num) {
  // Return a string of the number here!
  /*
    the first approach i can think about is to typecasting the given input to string
  */
  
  return num.toString();
}

/*---- Sample Tests ----*/
const assert = require('chai').assert;
describe("Tests", () => {
  it("test", () => {
    assert.strictEqual(numberToString(67), '67');
  });
});
