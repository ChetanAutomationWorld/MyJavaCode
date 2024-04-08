package StringPractice.example;

import java.util.Arrays;

public class MutableVsImmutable {
    public static void main(String[] args) {

//        //Mutable
//        int a[] = {20,30,10,50,40};
//        System.out.println(Arrays.toString(a)); //[20, 30, 10, 50, 40]
//        Arrays.sort(a);// mutable
//        System.out.println(Arrays.toString(a));// [10, 20, 30, 40, 50]

        //Immutable
        String s = "welcome";// welcome
        System.out.println(s);
        s.concat("to my home");
        System.out.println(s);  // welcome

    }
}
