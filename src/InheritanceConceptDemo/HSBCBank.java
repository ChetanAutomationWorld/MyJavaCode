package InheritanceConceptDemo;

public class HSBCBank implements USBank,BrazilBank {  // we are achieving multiple inheritance
    //Is-a relationship

    //1. if class is implementing any interface then its mandatory to define/override all the methods of interface.

    // Overriding from USBank
    @Override
    public void credit() {
        System.out.println("HSBC---Credit");
    }

    @Override
    public void debit() {
        System.out.println("HSBC---Debit");
    }

    @Override
    public void transferMoney() {
        System.out.println("HSBC---TransferMoney");
    }

    //Seprate Methods of HSBCBank
    public void educationLoan(){
        System.out.println("HSBC---EducationLoan");
    }

    public void carLoan(){
        System.out.println("HSBC---CarLoan");
    }

    //Brazil Bank method overriding from BrazilBank

    @Override
    public void mutualFund() {
        System.out.println("HSBC---Mutual Fund");
    }
}
