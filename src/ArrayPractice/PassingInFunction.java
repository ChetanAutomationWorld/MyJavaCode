package ArrayPractice;

import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int nums[]  = {10,20,30,40};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[1]= 99;
    }


}
