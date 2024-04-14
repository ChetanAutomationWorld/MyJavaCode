package ThisAndStaticKeyword;

public class StaticMain {
    public static void main(String[] args) {

        //1. static method can access static stuff(method and variable) without creating object
        System.out.println(StaticDemo.a);
        StaticDemo.m1();

 //2.Static method can access non-static stuff through object
    StaticDemo sd = new StaticDemo();
        sd.m2();
        System.out.println(sd.b);

    //call non-static method through object
        sd.m();

    }
}
