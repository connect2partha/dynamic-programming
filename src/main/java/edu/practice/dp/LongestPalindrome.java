package edu.practice.dp;

// Find the longest palindrome from all the substrings of a string
public class LongestPalindrome {
    public static void main(String[] args) {
        LongestPalindrome o = new LongestPalindrome();
        System.out.println(o.longestPalindrome(null));
        System.out.println(o.longestPalindrome("babad"));
        System.out.println(o.longestPalindrome("a"));
        System.out.println(o.longestPalindrome("ab"));
        System.out.println(o.longestPalindrome("bb"));
    }

    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i); // Odd length palindrome
            int len2 = expandAroundCenter(s, i, i + 1); // Even length palindrome
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

}
