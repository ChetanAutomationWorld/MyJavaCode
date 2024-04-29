package MethodPractice.Demo;

public class StaticVsNonstatic {

    //global variable: scope of global vars will be available across all the function with some condition.
    String name = "Tom";  // non static global variable
    static int age = 25;  //static global variable

    public static void main(String[] args) {

        //call static method and variables
        //1. direct call
        sum();
        // calling by class name
        StaticVsNonstatic.sum();
        System.out.println(age);
        System.out.println(StaticVsNonstatic.age);
        //2. Call non static method and variables

        StaticVsNonstatic obj = new StaticVsNonstatic();
        obj.sendMail();
        System.out.println(obj.name);

        //can i access static method by using object reference
        obj.sum();// warning will be given




    }

    public void sendMail(){                   // Non static method
        System.out.println("send mail method");
    }

    public static void sum(){             // static method
        System.out.println("sum method");
    }

}
