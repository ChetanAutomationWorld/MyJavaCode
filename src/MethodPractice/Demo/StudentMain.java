package MethodPractice.Demo;

public class StudentMain {
    public static void main(String[] args) {


        //Student std = new Student();

        //1. using object reference variable

//        std.sid = 101;
//        std.sname = "Haary";
//        std.grad = 'A';

        //2. using Method
//        std.setStudentData(102,"Garry",'B');
//        std.printStudentData();

        //3. Using Constructor
        Student stu = new Student(201,"Ryan",'C');
        stu.printStudentData();

        //How Many ways we can store data into variables
        //1. By using object reference variable
        //2. Using Method
        //3. Using constructor



    }
}
