package arrayproblems;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        //Here we used two pointer approach to avoid looping
        int [] numbers = {4,3,5};
        int leftShift = numbers.length -1;
        for(int i=0;i<leftShift;i++){
            int temp = numbers[i];
            numbers[i] = numbers[leftShift];
            numbers[leftShift] = temp;
            leftShift -= 1;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
