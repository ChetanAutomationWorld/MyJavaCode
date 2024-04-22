package InheritanceConceptDemo;


    class Bank {

        double rio(){

            return 0;
        }
    }

    class ICCI extends Bank{

        double rio(){

            return 10.5;
        }
    }

    class SBI extends Bank{

        double rio(){

            return 20.5;
        }
    }
public class MethodOveriddingDemo {

    public static void main(String[] args) {

        ICCI obj = new ICCI();
        System.out.println(obj.rio());

        SBI obj1 = new SBI();
        System.out.println(obj1.rio());


    }
}
