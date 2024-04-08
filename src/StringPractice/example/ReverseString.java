package StringPractice.example;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        ReverseString obj = new ReverseString();
        String result= obj.reverse("Welcome");
        System.out.println("The reverse string is :" +result);

//        String s = "Welcome";
//        String rev = "";
//
//        for (int i = s.length()-1; i>=0;i--){
//            rev = rev + s.charAt(i);
//        }
//        System.out.println("The reverse string are :" +rev);



    }

    public String reverse(String name){

        String rev = "";
        for (int i= name.length()-1;i>=0;i--)
        {
            rev = rev + name.charAt(i);
        }
        return rev;


    }
}
