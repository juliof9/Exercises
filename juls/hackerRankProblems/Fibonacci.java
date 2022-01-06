package juls.hackerRankProblems;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static void main(String[] args) {
        fibo(8);
    }

    public static List<Integer> fibo (int n){

        ArrayList<Integer> arr = new ArrayList<Integer>();

        int num1 = 1, num2 = 1, f3 = 1, f2 = 0, f1;
        
        if(n == 1 || n == 0){
            arr.add(n);
            System.out.println(arr);
            return arr;
        }else if(n > 1 || n < 0) {
            arr.add(num2);
            for (int i = 1; i <= n; i++) {
                System.out.print(-(int)Math.pow(-1,i)*f3+" ");
                f1 = f2;
                f2 = f3;
                f3 = f1 + f2;
                arr.add(f3);
            }
            System.out.println();
            System.out.print(num1 + " ");
            arr.add(num2);
            for (int i = 2; i <= n; i++) {
                System.out.print(num2 + " ");
                num2 = num1 + num2;
                num1 = num2 - num1;
                arr.add(num1);
            }
            System.out.println();
        }

        printArr(arr);
        return arr;
    }

    public static void printArr(List<Integer> arr){
        for (int element :
                arr) {
            System.out.print(element + " ");
        }
    }

}
