package arrayproblems;

import java.util.Arrays;

public class IsArraySortedProperly {
    public static void main(String[] args) {
        int [] numbers = {1,9,2,3,4,5};
        int [] sortedArrays = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(sortedArrays);
        System.out.println("Give Array Soreted in Asc Order "+Arrays.equals(numbers,sortedArrays));


        //one more approach

        int[] arr = {1, 2, 3, 4, 5};
        boolean isSorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println("Is array sorted? " + isSorted);
    }
}
