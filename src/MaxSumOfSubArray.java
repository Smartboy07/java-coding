public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int [] arr = {2, 1, 5, 1, 3, 2};

        int subArraySize = 3;
        int currentSum = 0;
        int maxSum = 0;
        //get the start sum of first subarray;
        for(int i=0; i<subArraySize;i++){
            currentSum += arr[i];
        }

      /*  Sliding the window means shifting the subarray by one element at a time.

                Instead of summing the entire subarray each time, you remove the old element (leftmost) and add the new element (rightmost) to the sum.

                Efficiency: This avoids re-summing the entire subarray every time.*/
        //Now use sliding tatics in this we need to remove the left most value with currentsum and add it with next next right value
        for(int i=subArraySize; i<arr.length;i++){
            currentSum = currentSum - arr[i-subArraySize] + arr[i]; // Here we are removing the left most value and adding the right next value
            maxSum = Math.max(maxSum, currentSum);// update the max sum with max
        }
        System.out.println(maxSum);

    }
}
