package arrayproblems;

public class FindMaxSum {
    public static void main(String[] args) {
        int[] inputArray = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSum = 0;
        int currentSum = 0;

        for(int i : inputArray){
            currentSum += i;
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum < 0){
                currentSum =0;
            }
        }
        System.out.println("Maximum Sum in contiguous traverse is "+maxSum);
    }
}
