package ArrayPractice;

public class RepeatedElementCount {
    public static void main(String[] args) {

        int a[] = {1,4,5,3,3};

        int count = 0;

        for (int x:a){
            if (x==3){
                count++;
            }
        }
        System.out.println("the total number of repeat element is :" +count);







        }

    }

