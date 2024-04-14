package ThisAndStaticKeyword;

public class StaticDemo {

    static int a = 10;   // static variable
    int b = 20;          // non-static variable

    static void m1(){       // static method
        System.out.println("This is m1 static method...");
    }

    void  m2(){             // Non-static method
        System.out.println("This is m2 non-static method...");
    }

    //3. Non-static methods can access everything directly.
    void m(){
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }

//    public static void main(String[] args) {
//
//        //1. static method can access static stuff(method and variable) without creating object
//        System.out.println(a);
//        m1();
//
//        //2. Static method can access non-static stuff through object
//        StaticDemo sd = new StaticDemo();
//        sd.m2();
//        System.out.println(sd.b);
//
//        //call non-static method through object
//        sd.m();
//
//    }
}
