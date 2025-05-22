package arrayproblems;

import java.util.HashSet;

public class FirstDuplicateElement {
    public static void main(String[] args) {
        int[] arr = {2, 1,1, 3, 5, 3, 2};
        HashSet<Integer> traversedElement = new HashSet<>();
        int firstDuplicateElement = -1;
        for(int i: arr){
            if(traversedElement.contains(i)){
               firstDuplicateElement = i;
               break;
            }else{
             traversedElement.add(i);
            }
        }
        System.out.println("First Duplicate Number in the Array is "+firstDuplicateElement);
    }
}
