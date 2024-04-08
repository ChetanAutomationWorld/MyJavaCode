package StringPractice;

public class ReverseString {
    public static void main(String[] args) {

        //Approch 1

        String s = "Welcome";
        int len = s.length();// length method to find the length of string

        String rev="";

        for (int i=len-1 ; i>=0;i--){
            rev =  rev+s.charAt(i);


        }
        System.out.println("The reverse string is: " +rev);




    }
}
