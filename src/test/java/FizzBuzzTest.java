import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_return_Fizz_given_numzber_divisible_by_3() {
        int number = 0;
        for (; number <= 100; number++) {
            if (number % 3 == 0) {
                if (number % 5 == 0) {
                    assertThat(FizzBuzz.of(number).equals("FizzBuzz"));
                } else {
                    assertThat(FizzBuzz.of(number).equals("Fizz"));
                }
            } else if (number % 5 == 0) {
                assertThat(FizzBuzz.of(number).equals("Buzz"));
            } else {
                assertThat(FizzBuzz.of(number) == null);
            }
        }
    }
}