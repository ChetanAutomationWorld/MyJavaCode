package ClassAndMethod;

public class StudentMain {
    public static void main(String[] args) {

        Student obj = new Student();
        obj.si_id = 101;
        obj.s_name = "Anuj";
        obj.s_grade = 'A';
        obj.printData();

        Student obj2 = new Student();
        obj2.si_id = 102;
        obj2.s_name = "John";
        obj2.s_grade = 'B';
        obj2.printData();

    }
}
