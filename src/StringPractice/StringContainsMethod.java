package StringPractice;

public class StringContainsMethod {
    public static void main(String[] args) {

        String s = "Welcome";
        System.out.println(s.contains("Wel"));//true
        System.out.println(s.contains("come"));//true
        System.out.println(s.contains("Welcme"));//false
        System.out.println(s.contains("welcome"));//false
    }
}
