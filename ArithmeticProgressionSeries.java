package Algorithms;

/*
 * Given a first element a and common difference d of an arithmetic progression.
 *  Write a program to print the first n elements of progression. 
 */

public class ArithmeticProgressionSeries {

    public static void printAP(int a, int d, int n){
        System.out.println("a = " + a +", d = " + d + ", n = " + n);
        for (int i = 1; i <=n ; i++) {
            int term = a + (i-1)*d;
            System.out.print(term + " ");
        }
        System.out.println();
    }

    
    public static void printAPNthTerm(int a, int d, int n){
        System.out.println("a = " + a +", d = " + d + ", n = " + n);
        int term = a + (n-1)*d;
        System.out.println(n + "th term: " + term);
    }

    public static void main(String[] args) {
        printAP(1, 2, 5);
        printAP(2, 5, 7);
        printAPNthTerm(1, 2, 5);
        printAPNthTerm(2, 5, 7);
    }
}