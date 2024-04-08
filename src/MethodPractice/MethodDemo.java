package MethodPractice;

public class MethodDemo {
    public static void main(String[] args) {

        MethodDemo obj = new MethodDemo();
        String name = obj.getuserData();
        System.out.println(name);
        getuserData2();

        //Access MethodDemmo1 class

        MethodDemo1 obj1 = new MethodDemo1();
        obj1.getuserData3();



    }
    public String getuserData(){
        System.out.println("Welcome to our world");
        return "Chetan";
    }

    public static String getuserData2(){
        System.out.println("Hello Selenium");
        return "testing";
    }
}
