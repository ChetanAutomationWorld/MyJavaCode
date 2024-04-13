package ThisAndStaticKeyword;

public class Thiskeyword {

    int x,y;     // Class Varibale/instamce variable

    Thiskeyword(int x, int y){

        this.x = x;
        this.y = y;
    }

    void displayData(){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {

        Thiskeyword th =  new Thiskeyword(100,200);
        th.displayData();


    }
}
