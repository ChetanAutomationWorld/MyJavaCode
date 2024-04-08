package ArrayListConcept;

import java.util.ArrayList;
import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList <Integer> list = new ArrayList<>(10);
//
//        //adding element into list
//
//        list.add(466);
//        list.add(123);
//        list.add(444);
//        list.add(4566);
//        list.add(12893);
//
//
//
//        //Contain method in list
//        System.out.println(list.contains(123));//true
//        System.out.println(list.contains(203));//false
//        System.out.println(list);
//
//        //Remove
//        list.remove(3);
//
//        //update list
//        list.set(1,888);
//        System.out.println(list);

        //input
        for (int i=0; i <5; i++){
            list.add(in.nextInt());

        }
        //get item at any index
        for (int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);


    }
}
