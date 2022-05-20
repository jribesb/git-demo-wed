package jribes.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void fizzbuzz_of_1_returns_1() {
        FizzBuzzer fizzBuzzer = new FizzBuzzer();

        String result = fizzBuzzer.fizzbuzz(1);

        Assertions.assertThat(result).isEqualTo("1");
    }
}
