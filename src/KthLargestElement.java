import java.util.Arrays;

public class KthLargestElement {
    public static void main(String[] args) {
        int [] intArr = {3,9,4,1,2,7,3};
        int k= 3;
        Arrays.sort(intArr);
        System.out.println(intArr[intArr.length-k]);
    }
}
