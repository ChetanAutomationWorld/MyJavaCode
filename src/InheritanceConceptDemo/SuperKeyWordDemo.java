package InheritanceConceptDemo;

public class SuperKeyWordDemo {

    String color = "While";

    void eat(){
        System.out.println("eating");
    }
}

class Dog extends SuperKeyWordDemo{

    String color = "black";
    void displayColor(){
        //System.out.println(color);
        System.out.println(super.color);
    }
    void eat(){
        //System.out.println("eating bread");
        super.eat();
    }
}
