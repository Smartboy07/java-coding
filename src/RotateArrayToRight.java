import java.util.Arrays;

public class RotateArrayToRight {
    public static void reverseArray(int[] inputArray, int start, int end){
        while(start<end){
            int temp = inputArray[start];
            inputArray[start++]= inputArray[end];
            inputArray[end--]=temp;
        }
    }
    public static void main(String[] args) {
        int [] array = {1,2,4,5,6,7,4};
        int K = 3;
       reverseArray(array,0,array.length-1);
       reverseArray(array,0,K-1);
       reverseArray(array,K,array.length-1);
       System.out.print(Arrays.toString(array));
    }
}
