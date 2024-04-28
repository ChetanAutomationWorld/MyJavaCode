package InheritanceConceptDemo;

public interface USBank {

    int min_bal = 100;   // static in nature and behave like final/constant in nature

    public void credit();

    public void debit();

    public void transferMoney();


    // Only method implementation
    //No method body
    //Only method prototype
    // In interface we can decalre the variable and variable are by default static in nature.
    // vars value will not be changed.
    // no static method in interface
    // no main method
    // we can't create the object of interface
    //interface is abstract in nature
}
