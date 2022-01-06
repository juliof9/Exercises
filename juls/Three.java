package juls;

import java.util.ArrayList;

public class Three {

    public static void main(String[] args) {

        int[] array = new int[]{1,2,3,4,5};
        //[1,3,5,7,9]
        firtsIndexOfElementInArray(array);

    }

    public static ArrayList firtsIndexOfElementInArray(int[] array){
        ArrayList<Integer> output = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if(i == 0){
                output.add(array[i]);
            }else{
                output.add(array[i] + output.get(i-1));
            }
        }
        System.out.println(output);
        return output;
    }
}
