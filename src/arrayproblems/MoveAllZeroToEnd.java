package arrayproblems;

import java.util.Arrays;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        //we will use two pointer approach
        int[] arr = {0, 1, 0, 3, 12};// this is our array
        int j=0; // our pointer to track non-zero elements
        for(int i =0; i<arr.length;i++){//iterate through array and get all non zero element for starting
            if(arr[i] !=0){
                arr[j++] = arr[i];
            }
        }
        //Now use length of array and add zero from where j ends in loop
        while(j<arr.length){
            arr[j++] = 0;
        }

        System.out.println("result is "+ Arrays.toString(arr));
    }

}
