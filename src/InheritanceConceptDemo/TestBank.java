package InheritanceConceptDemo;

public class TestBank {
    public static void main(String[] args) {

        System.out.println(USBank.min_bal);
        //USBank.min_bal = 200; // we cann't change the value of min_bal bcoz its final/constant in nature

        //compile time polymorphism
        HSBCBank hs = new HSBCBank();
        hs.credit();
        hs.debit();
        hs.transferMoney();
        hs.carLoan();
        hs.educationLoan();

        System.out.println("**************");

        //Dynamic polymorphism:
        //child class object can be referred by parent interface reference vars

        USBank b = new HSBCBank();
        b.credit();
        b.debit();
        b.transferMoney();

    }
}
