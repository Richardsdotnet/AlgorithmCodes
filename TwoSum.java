package algorithm;


import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbs = {11,2,7,12,15};
        int target = 9;
        System.out.println(Arrays.toString(sumIndex(target,numbs)));
    }


    private static int[] sumIndex(int target, int[] numbers) {

        int [] newList = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1 ; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    newList[0] = i;
                    newList[1] = j;
                }

            }
        }
        return newList;
    }
}

