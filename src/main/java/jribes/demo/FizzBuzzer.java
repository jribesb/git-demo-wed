package jribes.demo;

public class FizzBuzzer {
    public String fizzbuzz(int number) {
        if (number == 3) {
            return "fizz";
        }
        if (number == 5) {
            return "buzz";
        }
        return String.valueOf(number);
    }
}
