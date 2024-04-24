package InheritanceConceptDemo;


    class Bank {

        double roi(){

            return 0;
        }
    }

    class ICCI extends Bank{

        double roi(){

            return 10.5;
        }
    }

    class SBI extends Bank{

        double roi(){

            return 20.5;
        }
    }
public class MethodOveriddingDemo {

    public static void main(String[] args) {

        ICCI obj = new ICCI();
        System.out.println(obj.roi());

        SBI obj1 = new SBI();
        System.out.println(obj1.roi());


    }
}
