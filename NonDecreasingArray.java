package Algorithms;

public class NonDecreasingArray {
    public static boolean check(int[] input) {
        int countR = 0;
        int len = input.length;
        int prev = input[len-1];
        for(int i=len-2;i>=0;i--){
            if(prev<input[i]){
                countR++;
            }else
                prev = input[i];
        }
        int countL = 0;
        prev = input[0];
        for(int i=1;i<len;i++){
            if(prev>input[i]){
                input[i] = prev+1;
                countL++;
            }else
                prev = input[i];
        }
        int result = Math.min(countR, countL);
        return result>1?false:true;
    }

    public static void main(String[] args) {
        System.out.println(check(new int []{4, 5, 1, 7}));
        System.out.println(check(new int []{10, 5, 2}));
        System.out.println(check(new int []{1, 2, 1, 5}));
        System.out.println(check(new int []{1, 1, 1, 1}));
    }
}