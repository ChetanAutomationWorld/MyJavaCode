package ArrayListConcept;

import java.util.ArrayList;

public class practice1 {
    public static void main(String[] args) {

        ArrayList<String> a  = new ArrayList<String>();
        a.add("chetan");
        a.add("Tom");
        a.add("lilly");
        a.add("Selenium");
//        System.out.println(a.get(2));// retrive the value of 2nd index

        //using for-loop
//        for (int i=0;i< a.size();i++)
//        {
//            System.out.println(a.get(i));
//        }
        //enhancd for-loop
        for (String x:a)
        {
            System.out.println(x);
        }




    }
}
