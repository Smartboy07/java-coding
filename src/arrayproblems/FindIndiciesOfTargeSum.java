package arrayproblems;

public class FindIndiciesOfTargeSum {
    public static void main(String[] args) {
        int[] inputArray = {2,3,4,5,7, 11, 15};
        int target = 9;
        int leftPointer = 0;
        int rightPointer = inputArray.length-1;
        while (leftPointer<rightPointer){
            int sum = inputArray[leftPointer]+inputArray[rightPointer];
            if(sum == target){
                System.out.println("["+(leftPointer+1)+","+(rightPointer+1)+"]");
                break;
            }else if(sum > target){
                rightPointer--;
            }else{
                leftPointer --;
            }
        }
    }
}
