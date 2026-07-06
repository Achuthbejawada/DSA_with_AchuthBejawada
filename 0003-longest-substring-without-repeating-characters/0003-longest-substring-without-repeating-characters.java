import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        Stack<Character> st = new Stack<>();

        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {

            while (st.contains(s.charAt(i))) {
                st.remove(0);   // remove from front
            }

            st.push(s.charAt(i));

            maxLen = Math.max(maxLen, st.size());
        }

        return maxLen;
    }
}