package ArrayListConcept;

public class MaxValueInArrayRange {
    public static void main(String[] args) {

        int[] arr = {1,3,9,28,18};
        System.out.println(maxRange(arr,0,2));
    }
    static int maxRange(int[] arr, int start, int end){
        int maxVal = arr[start];
        for (int i=1; i<=end ; i++){
            if (arr[i]>maxVal){
                maxVal = arr[i];
            }

        }
        return maxVal;
    }
}
