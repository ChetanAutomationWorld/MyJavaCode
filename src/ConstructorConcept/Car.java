package ConstructorConcept;

public class Car {

    //Class Variables
    String name;
    int price;

    String engine;

    public Car(String name,int price,String engine){

        this.name = name;
        this.price = price;
        this.engine = engine;

    }


    public static void main(String[] args) {

        Car obj = new Car("BMW",25,"Automatic");
        Car obj1 = new Car("Honda",15,"Automatic");
        Car Obj2 = new Car("Tata",5,"Manual");

        System.out.println(obj.name+" "+obj.price+" "+obj.engine);


    }
}
