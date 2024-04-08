package MethodPractice.Demo;

public class ConstructorDemo {

    int x,y;

    ConstructorDemo(){   // 1. Default Constructor
         x=500;
         y=200;
    }

    ConstructorDemo(int a , int b){
         x = a;
         y = b;
    }

    void sum(){
        System.out.println(x+y);
    }


    public static void main(String[] args) {

        //ConstructorDemo cd = new ConstructorDemo();// invoke default constructor
        ConstructorDemo cd = new ConstructorDemo(40,50); // Parameterised constructor
        cd.sum();



    }
}
