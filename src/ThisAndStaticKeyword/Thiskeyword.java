package ThisAndStaticKeyword;

public class Thiskeyword {

    int x,y;     // Class Varibale/instamce variable

    //This Keyword: Its represents Class/Object

    //Constructor
//    Thiskeyword(int x, int y){
//
//        this.x = x;
//        this.y = y;
//    }
    //User definded methd
    void setData(int x, int y){

        this.x = x;
        this.y = y;
    }

    void displayData(){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {

        //Constructor calling
        //Thiskeyword th =  new Thiskeyword(100,200);

        Thiskeyword th = new Thiskeyword();
        th.setData(100,200);

        th.displayData();


    }
}
