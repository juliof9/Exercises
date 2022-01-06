package juls;

public class One {

    public static void main(String[] args) {
        int[] array = new int[]{5,6,7,8,1};
        minIndex(array);
    }

     public static int minIndex(int[] array){
        int minIndex = -1;
        int minValue = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] < minValue || minIndex == -1){
                minIndex = i;
                minValue = array[i];
            }
        }
        System.out.println(minIndex);
        return minIndex;
    }
}
