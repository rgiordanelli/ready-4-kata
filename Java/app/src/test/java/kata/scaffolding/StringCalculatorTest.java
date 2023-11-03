package kata.scaffolding;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
  StringCalculator stringCalculator = new StringCalculator();

  @Test
  void when_Empty_String_Is_Passed_Then_Zero_Is_Returned() {
    int computedValue = stringCalculator.add("");
    Assertions.assertEquals(0, computedValue);
  }

  @Test
  void when_One_Figure_Is_Passed_Then_The_Sum_Is_Returned() {
    int computedValue = stringCalculator.add("1");
    Assertions.assertEquals(1, computedValue);
  }
}
