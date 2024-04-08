package MethodPractice.Demo;

public class Student {

    // Class variable.we can use everywhhere
    int sid;
    String sname;
    char grad;



    void printStudentData(){
        System.out.println(sid+" "+sname+" "+grad);
    }

    void setStudentData(int id,String name,char gra){

        sid= id;
        sname = name;
        grad = gra;
    }
    // Method = assignment + Operation
    //Constructor = only for assignment

    Student(int id,String name,char gra){
        //intializing Data into variable
        sid = id;
        sname = name;
        grad = gra;
    }
}
