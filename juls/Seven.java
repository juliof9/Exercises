package juls;

import java.util.ArrayList;

public class Seven {

    public static void main(String[] args) {
        int[] array1 = new int[]{1,3,8,99};
        int[] array2 = new int[]{2,4,70,11,10};

        mergeTwoSortedList(array1, array2);

    }

    public static ArrayList mergeTwoSortedList(int[] l1, int[] l2){
        ArrayList<Integer> result = new ArrayList<>();

        if(l1[0] < l2[0]){
            for (int element :
                    l1) {
                result.add(element);
            }
        }
        for (int element :
                l2) {
            result.add(element);
        }
        System.out.println(result);
        return result;
    }

}
