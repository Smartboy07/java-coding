import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

    public static HashMap<String, ArrayList<String>> groupAnagramWords(String[] words){
        HashMap<String, ArrayList<String>> output = new HashMap<>();
        for(String word : words){
           char[] wordChars = word.toLowerCase().toCharArray();
           Arrays.sort(wordChars);
           String key = new String(wordChars);
           output.computeIfAbsent(key, k-> new ArrayList<>()).add(word);
        }
        return output;
    }
    public static Boolean checkAnagram(String str1, String str2){
        char [] firstCharArray = str1.toLowerCase().toCharArray();
        char [] secondCharArray = str2.toLowerCase().toCharArray();
        Arrays.sort(firstCharArray);
        Arrays.sort(secondCharArray);
        return Arrays.equals(firstCharArray,secondCharArray);
    }
    public static void main(String[] args) {
        String [] inputWords = {"Dog","God", "tea","eat"};
        System.out.println(checkAnagram("Dog","God"));
        System.out.println(groupAnagramWords(inputWords));
    }
}
