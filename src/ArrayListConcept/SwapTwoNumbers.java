package ArrayListConcept;

import java.util.Arrays;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        int[] arr = {1,3,9,12,15};
        swap(arr,0,4);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
