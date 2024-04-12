package ConstructorConcept;

public class ConstructorConceptDemo {

    //Class vars: Instance variable
    String name;
    int age;


    public  ConstructorConceptDemo(){  // 0 parameter

        System.out.println("Default constructor");
    }

    public  ConstructorConceptDemo(int a){  // 1 parameter

        System.out.println("1 para constructor");
    }

    public ConstructorConceptDemo(int i, int j){

        System.out.println("2 para constructor");
        System.out.println(i+" "+j);
    }

    public ConstructorConceptDemo(String name, int age){

        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {

        ConstructorConceptDemo obj= new ConstructorConceptDemo();
        ConstructorConceptDemo obj1 = new ConstructorConceptDemo(10);
        ConstructorConceptDemo obj2 = new ConstructorConceptDemo(10,20);
        ConstructorConceptDemo obj3 = new ConstructorConceptDemo("tom",25);

        System.out.println(obj3.name+" "+ obj3.age);



    }
}
