package juls;

public class Five {

    public static void main(String[] args) {
        int[] array = new int[]{50,6,7,8,1,0};
        findMaxNum(array);
    }
    //Funcion que encuentra el numero mayor del arreglo
    public static int findMaxNum(int[] nums){
        int max_num = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max_num){
                max_num = nums[i];
            }
        }
        System.out.println(max_num);
        return max_num;
    }
}
