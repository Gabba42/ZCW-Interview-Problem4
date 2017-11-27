package io.zipcoder;

public class Problem4 {

    public String canFormPalindrome(String str) {
        String result;
        int[] frequency = new int[300]; 
        char[] strToCharArray = str.toCharArray();
        for (char ch : strToCharArray) {
            frequency[ch]++;
        }

        int oddCharCount = 0;
        for (int ch : frequency) {
            if (ch % 2 != 0) { // Count characters with odd occurrence.
                oddCharCount++;
            }
            if (oddCharCount > 1) {// If more than one character in the string has odd occurrence then palindrome cannot be formed
                result = "NO";
                return result;
            }
        }

        result = "YES";
        return result;
    }
}
