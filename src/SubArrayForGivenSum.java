import java.util.LinkedHashMap;

public class SubArrayForGivenSum {
    public static String getSubArrayForGivenSum(int [] inputArray, Integer targetSum){
        int currentSum = 0;
        LinkedHashMap<Integer,Integer> sumPrefixMap = new LinkedHashMap<>();
        for(int i=0; i< inputArray.length; i++){
            currentSum += inputArray[i];
            if(currentSum == targetSum){
                return "sub Array is from 0 to"+ i;
            }
            if(sumPrefixMap.containsKey(currentSum-targetSum)){
                int start = sumPrefixMap.get(currentSum-targetSum)+1;
                return "subArray is From "+ start +" to "+i;
            }
            sumPrefixMap.put(currentSum,i);
        }
        return "No SubArray available with given string";
    }
    public static void main(String[] args) {
        int [] inputArray = {9,3,4,1,5,3,2};
        System.out.println(getSubArrayForGivenSum(inputArray,5));

    }
}
