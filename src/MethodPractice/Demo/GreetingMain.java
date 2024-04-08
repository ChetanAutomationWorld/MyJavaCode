package MethodPractice.Demo;

public class GreetingMain {
    public static void main(String[] args) {

        Greeting gr = new Greeting();
        gr.m1();

        String s = gr.m2();
        System.out.println(s);

        gr.m3("John");

        String var = gr.m4("David");
        System.out.println(var);
    }
}
