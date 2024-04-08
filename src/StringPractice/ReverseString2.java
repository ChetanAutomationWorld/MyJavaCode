package StringPractice;

public class ReverseString2 {
    public static void main(String[] args) {

        //without using string method
        //By converting String to char array type

        String s = "Selenium";
        String rev = "";

        char []a = s.toCharArray();

        for (int i= a.length-1;i>=0;i--){  // a.length--> lenth of array and a.length-1 --> last index of array
//            System.out.println(a[i]);
            rev = rev + a[i];
        }
        System.out.println("The reverse string is :" +rev);
    }
}
