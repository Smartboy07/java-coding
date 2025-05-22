package arrayproblems;

import java.util.Arrays;
import java.util.HashMap;

public class FindIndexOfTwoSum {
    private static int[] findIndex(int [] inputArray, int targetSum){
        HashMap<Integer,Integer> diffIndexMap = new HashMap<>();
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i]<targetSum) {
                int difference = targetSum - inputArray[i];
                if (diffIndexMap.containsKey(difference)) {
                    return new int[]{diffIndexMap.get(difference), i};
                } else {
                    diffIndexMap.put(inputArray[i], i);
                }
            }
        }
        throw new IllegalArgumentException("No Result Found for given target");
    }

    public static void main(String[] args) {
        int[] a = {1,2,35,6,78,9};
        int targetSum = 10;
        int [] result = findIndex(a,targetSum);
        System.out.println(Arrays.toString(result));
    }
}
