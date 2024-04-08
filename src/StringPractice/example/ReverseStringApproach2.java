package StringPractice.example;

public class ReverseStringApproach2 {
    public static void main(String[] args) {

        //Approach 2

        String s = "Java";
        String rev = "";

        char[] a = s.toCharArray();
        for (int i= a.length-1;i>=0;i--){
            rev = rev + a[i];

        }
        System.out.println("The Reverse String is :" +rev);
    }
}
