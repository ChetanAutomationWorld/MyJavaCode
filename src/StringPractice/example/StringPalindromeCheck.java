package StringPractice.example;

public class StringPalindromeCheck {
    public static void main(String[] args) {

        String s = "welcome";
        String rev = "";

        for (int i = s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        System.out.println("The reverse string is : " +rev);

        if(s.equals(rev)){
            System.out.println("String is paalindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
