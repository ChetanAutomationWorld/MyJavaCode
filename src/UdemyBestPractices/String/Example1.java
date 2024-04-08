package UdemyBestPractices.String;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {

        //String is an object

        String s1 =  "Chetan Starts selenium";
        String [] s2= s1.split("Starts");
        System.out.println(Arrays.toString(s2));
    }
}
