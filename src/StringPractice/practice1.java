package StringPractice;

import java.util.Arrays;

public class practice1 {
    public static void main(String[] args) {

        String s = "Welcome";
        s.length();
//        System.out.println(s.length());
//        System.out.println("welcome".length());  // length of string

        //concat: joining string

        String s1 = " Welcome";
        String s2 = " to our world Java";
        String s3 = " Join Here";

//        System.out.println(s1+s2+s3);// Welcome to our world Java Join Here
//
//
//        System.out.println(s1.concat(s2));// Welcome to our world Java
//        System.out.println(s1.concat(s2).concat(s3));// Welcome to our world Java Join Here
//        System.out.println(s1.concat(s2+s3));// Welcome to our world Java Join Here
//
//        System.out.println("welcome" + " Java");// welcome Java
//        System.out.println("welcome".concat(" java"));// welcome java

        // Trim method - remove spaces right and left side

        String s4 = "   Welcome   ";
        System.out.println("The length of string before trim :" +s4.length());
        System.out.println(s4.trim());// o/p :
        System.out.println("The length of string after trim :" +s4.trim().length());

        //charAt(): return(extract) of the character of the string based on index
        // Index starts from 0
        s4 = "Welcome";
        System.out.println(s4.charAt(3));//o/p-->c
        System.out.println(s4.charAt(0)); //o/p:w

        //contains() --> returns true or false  always
        //check string is part of main string or  not

        System.out.println(s4.contains("Wel")); // true
        System.out.println(s4.contains("come")); //true
        System.out.println(s4.contains("wel")); //false
        System.out.println(s4.contains("Welcme"));// false
        System.out.println("*****************************");

        //equals and equalIgnoreCase()  compare string
        s1 = "welcome";
        s2 = "welcome";

        System.out.println(s1==s2);//true
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals("Welcome"));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true

        //replace()--> replace single/multiple(sequence of character in a string)

        s = "welcome to selenium java selenium python selenium c#";
        System.out.println(s.replace('e','X'));//wXlcomX to sXlXnium java sXlXnium python sXlXnium c#

        System.out.println(s.replace("selenium","playright"));//welcome to playright java playright python playright c#

        s = "abccabaa";
        System.out.println(s.replace('a','X').replace('c','Y'));//XbYYXbXX
        System.out.println("*****************************");

        //substring()--> extract substring from the main string
        //starting index -->0
        //Ending index -->1

        s = "Welcome";
        System.out.println(s.substring(2,5));//lco
        System.out.println(s.substring(0,3));// Wel
        System.out.println(s.substring(0,1)); //W
        System.out.println("*********************************");

        //toUpperCase() & toLowerCase() methods
        s= "Selenium";
        System.out.println(s.toLowerCase());//selenium
        System.out.println(s.toUpperCase());//SELENIUM
        System.out.println("***********************************");

        //split() -- split the syring into multiple part based on delimeter
        //split method return array
        s = "abc@gmail.com";

        String a[] = s.split("@");
        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(s.split("@")));
////        System.out.println(a[0]);//abc
//        System.out.println(a[1]);//gmail.com

        //example1

        String amount = "$15,20,25";
        System.out.println(amount.replace("$",""));//15,20,25
        System.out.println(amount.replace("$","").replace(",",""));//152025
        //example3

         s = "abc,123@xyz";  // abc   123   xyz
         String arr1[] = s.split(",");
        System.out.println(Arrays.toString(arr1)); //[abc, 123@xyz]
        String arr2[] = arr1[1].split("@");
        System.out.println(Arrays.toString(arr2)); //[123, xyz]

        System.out.println(arr1[0]+" "+arr2[0]+" "+arr2[1]);

        //example 3
        s="abc 123";
        String arr3[] = s.split(" ");
        System.out.println(Arrays.toString(arr3));

        // * % ^ & ( ) --> you can't used as a deliemeter

        //example 4

        s= "abc 123 zyz";
        String arr4[] =s.split(" ");
        System.out.println(Arrays.toString(arr4));//[abc, 123, zyz]

        //example 5
        String name = "John kenedy";

        //System.out.println(name.contains("john"));//false
        System.out.println(name.replace('J','j').contains("john"));//true

        String arr5[] = name.split(" ");
        System.out.println(Arrays.toString(arr5));
        System.out.println(arr5[0].contains("John"));






























    }
}
