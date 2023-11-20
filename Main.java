public class Main {
    public static void main(String [] args){
        Algorithm a = new Algorithm();
        System.out.println(a.stringOccurs("Hello World", "World")); // Should Print true
        System.out.println(a.stringOccurs("Goodbye World", "Hello")); // Should Print false
        System.out.println(a.stringOccurs("Wonderful", "Wonder")); // Should Print true
        System.out.println(a.stringReversed("gohangasalami")); // Should Print imalasagnahog
        System.out.println(a.stringReversed("giraffe")); // Should Print effarig
        System.out.println(a.stringReversed("HooH")); // Should Print HooH
        System.out.println(a.isPalindrome("amanaplanacanalpanama")); //Should Print true
        System.out.println(a.isPalindrome("notthesame")); // Should Print false
        System.out.println(a.isPalindrome("madam")); // Should Print true
        System.out.println(a.numOccurences("Mississippi", "si")); // Should Print 2
        System.out.println(a.numOccurences("wowowowo", "ow")); // Should Print 3
        System.out.println(a.numOccurences("algorithms","mint" )); // Should Print 0
    }
}