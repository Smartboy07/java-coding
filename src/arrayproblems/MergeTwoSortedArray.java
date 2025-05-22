package arrayproblems;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void mergeTwoSortedArrays(int [] a, int [] b ){
        int i = a.length -1;
        int j = b.length -1;
        int [] c = new int [a.length+ b.length];
        int k = c.length -1;

        while (i >=0 || j>=0){
            if(i>=0 && j>=0){
             if(a[i] > b[j]){
                 c[k--] = a[i--];
             }else{
                 c[k--] = b[j--];
             }
            }else if(i >= 0){
                c[k--] = a[i--];
            }else{
                c[k--] = b[j--];
            }
        }
        System.out.println(Arrays.toString(c));
    }

    public static void main(String[] args) {
        int [] a = {1,3,4,6};
        int [] b ={2,5,7,10};
        mergeTwoSortedArrays(a,b);
    }
}
