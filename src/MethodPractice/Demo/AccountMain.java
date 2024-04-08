package MethodPractice.Demo;

public class AccountMain {

    public static void main(String[] args) {

        Account obj = new Account();

        obj.setAccno(101);
        obj.setAmount(1000.2);
        obj.setName("John");

        System.out.println(obj.getAccno());
        System.out.println(obj.getAmount());
        System.out.println(obj.getName());






    }
}
