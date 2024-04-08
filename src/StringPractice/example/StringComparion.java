package StringPractice.example;

public class StringComparion {
    public static void main(String[] args) {

        //case-1
//        String s1 = "welcome";
//        String s2 = "welcome";
//        System.out.println(s1==s2); //true
//        System.out.println(s1.equals(s2)); //true

        //case-2
//        String s1 = new String("welcome");
//        String s2 = new String("welcome");
////        System.out.println(s1); // welcome
////        System.out.println(s2); //welcome
//        System.out.println(s1==s2);//false
//        System.out.println(s1.equals(s2));//true

        //case -3
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true






    }
}
