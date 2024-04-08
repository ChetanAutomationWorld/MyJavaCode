package ArrayPractice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayBetweenTwoNumbers {
    public static void main(String[] args) {

        // 1-->4 : 1,2,3,4
        // 1--> 10: 1,2,3,4...9,10

        System.out.println(Arrays.toString(between(1,4)));


    }


    public static int[] between(int a, int b){
        return IntStream.rangeClosed(a,b).toArray();
    }


}


