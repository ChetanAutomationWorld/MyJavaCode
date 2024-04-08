package StringPractice.example;

import java.util.Scanner;

public class TotalWordsCountInString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter any string :");// welcome to java
        String str = sc.nextLine();

        String[] arr = str.split(" ");

        System.out.println("The total words count is :" +arr.length);


    }

}