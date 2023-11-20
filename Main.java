public class Main {
    public static void main(String [] args){
        Algorithm a = new Algorithm();
        System.out.println(a.numDigits(987654321)); // Should Print 9
        System.out.println(a.numDigits(4321)); // Should Print 4
        System.out.println(a.numDigits(123456)); // Should Print 6
        System.out.println(a.firstDivisibleSec(9,3)); // Should Print true
        System.out.println(a.firstDivisibleSec(4,3)); // Should Print false
        System.out.println(a.firstDivisibleSec(16,4)); // Should Print true
        System.out.println(a.sumOfOdd(4,9)); // Should print 21
        System.out.println(a.sumOfOdd(3,11)); // Should print 35
        System.out.println(a.sumOfOdd(6,12)); // Should print 27
        System.out.println(a.sumOfTens(10,99)); // Should print 450
        System.out.println(a.sumOfTens(22,100)); // Should print 520
        System.out.println(a.sumOfTens(29,117)); // Should print 630
        System.out.println(a.sumOfDigits(321)); // Should print 6
        System.out.println(a.sumOfDigits(47216)); // Should print 20
        System.out.println(a.sumOfDigits(4511)); // Should print 11
        System.out.println(a.largestPowOfTwo(33)); // Should print 32
        System.out.println(a.largestPowOfTwo(16)); // Should print 16
        System.out.println(a.largestPowOfTwo(800)); // Should print 512
    }
}