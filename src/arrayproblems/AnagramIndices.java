package arrayproblems;

import java.util.*;

public class AnagramIndices {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) return result;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // Initialize character counts for p and the first window of s
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pCount, sCount)) {
            result.add(0);
        }

        // Slide the window over s
        for (int i = p.length(); i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;                     // add new char
            sCount[s.charAt(i - p.length()) - 'a']--;        // remove old char

            if (Arrays.equals(pCount, sCount)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        AnagramIndices ai = new AnagramIndices();

        String s1 = "cbaebabacd", p1 = "abc";
        System.out.println("Output: " + ai.findAnagrams(s1, p1)); // Output: [0, 6]

        String s2 = "abac", p2 = "ab";
        System.out.println("Output: " + ai.findAnagrams(s2, p2)); // Output: [0, 1, 2]
    }
}
