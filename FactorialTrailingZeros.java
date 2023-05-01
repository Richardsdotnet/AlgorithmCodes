package algorithm;

import java.util.Scanner;

public class FactorialTrailingZeros {
    public static void main(String[] args) {
        System.out.println("Enter number to check number of zeros in the factorial");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        zeroCount(number);
    }

        public static void zeroCount(int number){
            int count = 0;
            while (number > 0){
                number /= 5;
                count += number;
            }
            System.out.printf("The number of trailing zeros is:" + count);
        }
}
