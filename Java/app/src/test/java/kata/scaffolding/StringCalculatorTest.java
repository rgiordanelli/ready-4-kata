package kata.scaffolding;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
  StringCalculator stringCalculator = new StringCalculator();

  @Test
  void when_Empty_String_Is_Passed_Then_Zero_Is_Returned() {
    int computedValue = stringCalculator.add("");
    assertEquals(0, computedValue);
  }

  @Test
  void when_One_Figure_Is_Passed_Then_The_Sum_Is_Returned() {
    int computedValue = stringCalculator.add("1");
    assertEquals(1, computedValue);
  }
  @Test
  void when_theInputIsAListOfNumbers_thenTheSumIsReturned() {
    int computedValue = stringCalculator.add("1,2,3");
    assertEquals(6, computedValue);
  }

}
