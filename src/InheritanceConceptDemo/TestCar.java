package InheritanceConceptDemo;

public class TestCar {
    public static void main(String[] args) {

        //Static Polymorphism-- compile time polymorphism
        BMW b = new BMW();
        b.start();
        b.stop();
        b.threatSafty();
        b.reFuel();
        b.engine();

        System.out.println("************");

        Car c = new Car();
        c.start();
        c.stop();
        c.reFuel();
        c.engine();
        System.out.println("*************");

        //Top Casting
        Car c1 = new BMW();//child class object can be referred by parent class reference variable-- Dynamic Polymorphism--Rum time Polymorphism
        c1.start();
        c1.stop();
        c1.reFuel();
        c1.engine();

        //Down Casting
        //BMW b1 = new Car(); // Not possible
        //BMW b1 = (BMW) new Car(); //ClassCastException


    }
}
