package ArrayPractice;

import java.util.Arrays;

public class excercise1 {
    public static void main(String[] args) {

        int a[] = {50,20,40,10,100};
        System.out.println("Before Sorting Array Element is: " + Arrays.toString(a));


        int n = a.length; // length of array

        for (int i=0;i<n-1;i++){                          // No. of passes
            for (int j=0;j<n-1;j++){
                if (a[j]>a[j+1]){
                    int temp = a[j];   //Swap part
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        System.out.println("After sorting Array Element is: " +Arrays.toString(a));


    }
}
