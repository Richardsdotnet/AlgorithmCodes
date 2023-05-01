package algorithm;

public class Palindrome {
    public static void main(String[] args) {
        isPalindrome(120021);
    }
    public static void isPalindrome(int number) {
        if (number < 0 || (number % 10 == 0 && number != 0)) System.out.println("number not Palindrome");
        else System.out.println("Number is Palindrome");

        int revertedNumber = 0;
        while (number > revertedNumber){
            revertedNumber = revertedNumber * 10 + number % 10;
            number /= 10;
        }
    }

}