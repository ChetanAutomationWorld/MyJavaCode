package StringPractice;

public class StringTrimMethod {
    public static void main(String[] args) {

        String s = "   Welcome   ";
        System.out.println(s);
        System.out.println("The length of string before trim: " +s.length());//13
        System.out.println(s.trim());
        System.out.println("The length of string after trim: " +s.trim().length());//7

    }
}
