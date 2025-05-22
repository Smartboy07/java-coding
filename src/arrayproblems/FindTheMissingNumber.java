package arrayproblems;

public class FindTheMissingNumber {
    public static void main(String[] args) {
        int [] missingNumberArray =  {1, 2, 4, 5};
        int n = missingNumberArray.length+1; // as we know one number is missed we need to add that one
        int expectedSum = n*(n+1)/2;
        int actualSum =0;
        for(int i: missingNumberArray){
            actualSum += i;
        }
        System.out.println("Missing number is "+(expectedSum-actualSum));
    }
}
