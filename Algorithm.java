public class Algorithm {

    public int numDigits(int number) {
        int digits = 0;
        while (number % 10 != 0) {
            number /= 10;
            digits++;
        }
        return digits;
    }

    public boolean firstDivisibleSec(int first, int second) {
        return ((double) first / second) == first / second;
    }

    public int sumOfOdd(int first, int second) {
        int sum = 0;
        int start = 0;
        if (first > second) {
            start = second;
            while (start <= first) {
                if (start % 2 != 0) {
                    sum += start;
                }
                start++;
            }
        } else {
            start = first;
            while (start <= second) {
                if (start % 2 != 0) {
                    sum += start;
                }
                start++;
            }
        }
        return sum;
    }

    public int sumOfTens(int first, int second) {
        int sum = 0;
        int start = 0;
        if (first > second) {
            start = second;
            while (start <= first) {
                if (start % 10 == 0) sum += start;
                start++;
            }
        } else {
            start = first;
            while (start <= second) {
                if (start % 10 == 0) sum += start;
                start++;
            }
        }
        return sum;
    }

    public int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }

    public int largestPowOfTwo(int number) {
        int power = 1;
        while (true) {
            if (Math.pow(2, power) <= number) {
                power++;
            } else if (Math.pow(2, power) > number) {
                break;
            }
        }
        return (int) (Math.pow(2, power - 1));
    }

    public boolean stringOccurs(String first, String second) {
        return (first.indexOf(second) != -1);
    }

    public String stringReversed(String str) {
        int index = str.length();
        String newString = "";
        while (index > 0) {
            newString += (str.substring(index - 1, index));
            index--;
        }
        return newString;
    }

    public boolean isPalindrome(String str) {
        String reversedString = "";
        int index = str.length();
        while (index > 0) {
            reversedString += (str.substring(index - 1, index));
            index--;
        }
        return (str.equals(reversedString));
    }

    public int numOccurences(String str, String substring) {
        int occurences = 0;
        int index = 0;
        int checklength = substring.length();
        while (index + checklength <= str.length()) {
            if (str.substring(index, index + checklength).equals(substring)) {
                occurences++;
                index ++;
            }
            else index++;
        }
        return occurences;
    }
}

