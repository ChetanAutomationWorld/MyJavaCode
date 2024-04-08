package StringPractice.example;

public class StringVsStringBufferVsStringBuilder {
    public static void main(String[] args) {

        //String --  Immutable
//
//        String s = "welcome";
//        s.concat("to java");
//        System.out.println(s); // o/p--> welcome(you can't change original value)

        //StringBuffer -- Mutable
//        StringBuffer s = new StringBuffer("welcome");
//        s.append("to java");
//        System.out.println(s);//welcometo java

        //StringBuilder -- Mutable
        StringBuilder s = new StringBuilder("Welcome");
        s.append(" to Selenium");
        System.out.println(s);// Welcome to Selenium



    }
}
