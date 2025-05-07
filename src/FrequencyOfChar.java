import java.util.TreeMap;

public class FrequencyOfChar {
    public static TreeMap getFrequencyOfChar(String word){
        char[] wordChars = word.toCharArray();
        TreeMap<Character,Integer> frequencyCharMap = new TreeMap<>();
        for(int i=0 ; i<word.length();i++){
            frequencyCharMap.put(wordChars[i], frequencyCharMap.getOrDefault(wordChars[i],0)+1);
        }
        return frequencyCharMap;
    }
    public static void main(String[] args) {
        System.out.println(getFrequencyOfChar("abhishekaa"));
    }
}
