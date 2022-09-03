package Algorithms;

import java.util.Arrays;

public class ThreeConsecutivesOdds {

    public static boolean check(int[] input) {
        int count = 0;
        for(int i=0;i<input.length;i++){
            if(input[i]%2!=0)
                count++;
            else
                count = 0;

            if(count==3)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] nums = {2, 4, 1, 3, 4, 1, 3, 6};
        System.out.println(Arrays.toString(nums) + ", three consecutive odds: " + check(nums));
        int [] nums_1 = {2, 4, 1, 3, 4, 1, 3, 5, 6};
        System.out.println(Arrays.toString(nums) + ", three consecutive odds: " + check(nums_1));
        int [] nums_2 = {2, 4, 1, 3, 4, 9, 1, 3, 0};
        System.out.println(Arrays.toString(nums) + ", three consecutive odds: " + check(nums_2));
    }
}