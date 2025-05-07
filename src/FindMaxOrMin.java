import java.util.Arrays;
import java.util.Comparator;

public class FindMaxOrMin {
    public static Integer findMinOrMaxWithJavaEight(Boolean isMin, String[] inputArray){
       String outPutValue = "0";
       if(isMin){
           outPutValue = Arrays.stream(inputArray).min(Comparator.naturalOrder()).get();
       }else{
           outPutValue =  Arrays.stream(inputArray).max(Comparator.naturalOrder()).get();
       }

       return Integer.parseInt(outPutValue);
    }

    public static Integer findMinOrMax(Boolean isMin, String[] inputArray){
        Integer outPutValue = 0;
        int rightIndex = 0;
        int leftIndex = inputArray.length-1;
        while(rightIndex < leftIndex){
            String temp1 = inputArray[rightIndex];
            String temp2 = inputArray[leftIndex];
            if(isMin){
               if(Integer.parseInt(temp1) <= Integer.parseInt(temp2)){
                 outPutValue = Integer.parseInt(temp1) < outPutValue ? Integer.parseInt(temp1) : outPutValue;
               }else{
                   outPutValue = Integer.parseInt(temp2) < outPutValue ? Integer.parseInt(temp2) : outPutValue;
               }
            }else{
                if(Integer.parseInt(temp1) >= Integer.parseInt(temp2)){
                    outPutValue = Integer.parseInt(temp1) > outPutValue ? Integer.parseInt(temp1) : outPutValue;
                }else{
                    outPutValue = Integer.parseInt(temp2) > outPutValue ? Integer.parseInt(temp2) : outPutValue;
                }
            }
            rightIndex++;
            leftIndex--;
        }

        return outPutValue;
    }
}
