package StringPractice;

public class StringConcatination {
    public static void main(String[] args) {

        String s1 = "Welcome";
        String s2 = " to our world Java";
        String s3 = " Join Here";

        System.out.println(s1+s2+s3);//Welcome to our world Java Join Here

        System.out.println(s1.concat(s2));//Welcome to our world Java

        System.out.println(s1.concat(s2).concat(s3));//Welcome to our world Java Join Here

        System.out.println(s1.concat(s2+s3));//Welcome to our world Java Join Here

        System.out.println("Welcome" + " Java");// Welcome Java

        System.out.println("Welcome".concat(s2));//Welcome to our world Java


    }
}
