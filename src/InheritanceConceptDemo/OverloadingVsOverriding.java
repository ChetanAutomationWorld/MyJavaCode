package InheritanceConceptDemo;

class ABC{
    void m1(int a){
        System.out.println(a);
    }

    void m2(int b){
        System.out.println(b);
    }
}

class XYZ extends ABC{

    //whatever method we created in parent class the same method is created in child class.only implementation has different.
    void m1(int a){   // Overriding
        System.out.println(a*a);
    }

    void m2(int a, int b){  // Overloading
        System.out.println(a*b);
    }
}


public class OverloadingVsOverriding {

    public static void main(String[] args) {

        XYZ xyzobj = new XYZ();
        xyzobj.m1(10);
        xyzobj.m2(20);
        xyzobj.m2(10,20);

    }
}
