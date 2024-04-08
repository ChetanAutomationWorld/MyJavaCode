package StringPractice;

public class ReplaceMethod {
    public static void main(String[] args) {

        String s = "Welcome to Java Selenium Java Selenium Python Selenium C#";
        System.out.println(s);
        System.out.println(s.replace("e","X"));//WXlcomX to Java SXlXnium Java SXlXnium Python SXlXnium C#

        System.out.println(s.replace("Selenium","Playwright"));//Welcome to Java Playwright Java Playwright Python Playwright C#

        String s1 = "abbcaabaa";
        System.out.println(s1.replace('a','X').replace('b','Y'));//XYYcXXYXX


    }
}
