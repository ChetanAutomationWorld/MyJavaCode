package WrapperClassDemo;

public class WrapperClassConcept {

    public static void main(String[] args) {


        String x = "100";
        System.out.println(x+20);

        //Data conversion from String to Int
        int i = Integer.parseInt(x);
        System.out.println(i+20);

        //Integer,Double,char,boolean

        //String to double conversion
        String y = "12.33";
        double d = Double.parseDouble(y);
        System.out.println(d+20);

        //String to Boolean
        String s= "true";
       boolean b =  Boolean.parseBoolean(s);
        System.out.println(b);


        //int to string conversion
        int j = 200;
        System.out.println(j+20);
        String s1 = String.valueOf(j);
        System.out.println(s1+20);


        String m = "100A";
        System.out.println(Integer.parseInt(m));// o/p: NumberFormatException

    }
}
