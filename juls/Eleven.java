package juls;

public class Eleven {

    public static void main(String[] args) {
        int target = 144, a = 0;
        while(++a * a != target);
        System.out.println("sqrt(" + target + ") = " + a);
    }

}
