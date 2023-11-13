public class Algorithms {
    public int numDigits(int number) {
        int digits = 1;
        while (number % 10 != 0) {
            number %= 10;
            digits++;
        }
        return digits;
    }

    public boolean firstDivisibleSec(int first, int second) {
        if (((double) first / (double) second) == first / second) return true;
        return false;
    }
}
