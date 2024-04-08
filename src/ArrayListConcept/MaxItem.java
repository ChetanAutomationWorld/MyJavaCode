package ArrayListConcept;

public class MaxItem {
    public static void main(String[] args) {

        int[] arr = {1,3,23,9,180};
        System.out.println(max(arr));
    }

    static int max(int[]arr){
        int maxVal = 0;
        for (int i=1; i< arr.length;i++){
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return  maxVal;

    }
}
