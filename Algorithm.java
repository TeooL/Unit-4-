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
    if (((double) first / (double) second) == first / second) return true;
    return false;
  }
  
  public int sumOfOdd(int first, int second){
    int sum = 0;
    int start = 0;
    if (first > second) {
      start = second;
      while (start <= first){
        if (start % 2 != 0){
          sum += start;
        }
        start ++;
      }
    }
    else {
      start = first;
      while (start <= second){
        if (start % 2 != 0){
          sum += start;
        }
        start++;
      }
    }
    return sum;
  }
  
  public int sumOfTens(int first, int second){
    int sum = 0;
    int start = 0;
    if (first > second){
      start = second;
      while (start <= first){
        if (start % 10 == 0)sum += start;
        start ++;
      }
    }
    else {
      start = first;
      while (start <= second){
        if (start % 10 == 0)sum += start;
        start ++;
      }
    }
    return sum;
  }
  
  public int sumOfDigits(int number){
    int sum = 0;
    int digits = numDigits(number);
    int count = 0;
    int tenths_place = digits;
    while (count != digits){
      sum += num % (1 * Math.abs(10,tenths_place));
      count ++;              
    return sum;
    }
  }
  
  public int largestPowOfTwo(int number){
    int largest = 0;
    return largest;
  }
}

