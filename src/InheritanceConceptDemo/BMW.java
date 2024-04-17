package InheritanceConceptDemo;

public class BMW extends Car {

    //When same method is present parent as well as in child class with same name and same number of arguments
    //Method overriding
    public void start(){  // Overriden method
        System.out.println("BMW--Start");
    }

   public void threatSafty(){
       System.out.println("BMW--Threatsafety");
   }
}
