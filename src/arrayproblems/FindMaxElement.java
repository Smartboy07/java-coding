package arrayproblems;

import java.util.Arrays;

public class FindMaxElement {
    public static void main(String[] args) {
        int [] numbers = {4,3,5,9,6,1,4};
        Arrays.sort(numbers);
        System.out.println("Max Element is "+numbers[numbers.length-1]);
    }
}
