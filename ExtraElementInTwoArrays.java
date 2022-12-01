import java.util.Arrays;

public class ExtraElementInTwoArrays {
    public static void getExtaElement(int [] arrA , int[] arrB){
        int extraElement = 0;
        for (int i = 0 ; i < arrA.length ; i++){
            extraElement ^= arrA[i];
        }
        for (int i = 0 ; i < arrB.length ; i++){
            extraElement ^= arrB[i];
        }
        System.out.println("Array A: " + Arrays.toString(arrA));
        System.out.println("Array B: " + Arrays.toString(arrB));
        System.out.println("Extra Element: " + extraElement);
    }
}
