package StringPractice;

public class EqualAndEqualIgnoreMethod {
    public static void main(String[] args) {

        String s1 = "Welcome";
        String s2 = "welcome";

        //System.out.println(s1==s2);
        System.out.println(s1.equals(s2));// false
        System.out.println(s1.equals("Welcome"));
        System.out.println(s1.equalsIgnoreCase(s2));

    }
}
