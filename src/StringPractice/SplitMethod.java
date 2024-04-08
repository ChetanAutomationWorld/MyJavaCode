package StringPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {

//        String s = "abc@gmail.com";
//        String a[] =  s.split("@");
//        System.out.println(Arrays.toString(a));// [abc, gmail.com]
//        System.out.println(Arrays.toString(s.split("@")));// [abc, gmail.com]
//        System.out.println(a[0]);// abc
//        System.out.println(a[1]);// gmail.com

        //example 1

//        String s1 = "abc,123@xyz"; // abc 123 xyz
//        String arr[] = s1.split(",");
//        System.out.println(Arrays.toString(arr)); // [abc, 123@xyz]
//        String arr1[] = arr[1].split("@");
//        System.out.println(Arrays.toString(arr1)); // [123, xyz]
//        System.out.println(arr[0]+" "+arr1[0]+" "+arr1[1]);

        //example 2
//
//        String s2 = "abc 123";
//        String arr3[] = s2.split(" ");
//        System.out.println(Arrays.toString(arr3));

        //example 3

//        String s3=  "abc 123 zyz";  // [abc,123,xyx]
//        String arr4[] = s3.split(" ");
//        System.out.println(Arrays.toString(arr4)); // [abc, 123, zyz]
//        System.out.println(arr4[0]+" "+arr4[1]+" "+arr4[2].replace("z","x"));// abc 123 xyx

        //example4

        String name = "John Kenedy";
        System.out.println(name.contains("john"));//false
        System.out.println(name.replace('J','j').contains("john"));//true
        String arr5[] = name.split(" ");
        System.out.println(Arrays.toString(arr5)); //[John, Kenedy]
        System.out.println(arr5[0].contains("John"));// true




    }
}
