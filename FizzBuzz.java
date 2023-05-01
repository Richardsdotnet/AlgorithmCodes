package algorithm;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzz {
    public static List<String> divisibility(int number){
        List<String> output = new ArrayList<>();
        for (int i = 1; i <= number ; i++) {
            if(i % 5 == 0 && i  % 3 == 0 ) output.add("FizzBuzz");
            else if (i % 5 == 0) output.add("Buzz");
            else if (i % 3 == 0) output.add("Fizz");
            else output.add(Integer.toString(i));

        }


    return output;}

    public static void main(String[] args) {
        System.out.println(divisibility(100));
    }
}