package com.vikky.coding.strings;

/**
 * 
 * Write a function that takes in a non-empty string and that returns a boolean
 * representing whether the string is a palindrome.
 *
 */

public class PalindromeCheck {

	public static void main(String[] args) {
		String input = "abcdcba";
		System.out.println(isPalindrome(input));
		System.out.println(isPalindromeOptimized(input));
	}

	
	/**
	 * O(n) - Time | O(n) - Space
	 * @param str
	 * @return
	 */
	public static boolean isPalindrome(String str) {
		return str == null ? true : str.equals(new StringBuilder(str).reverse().toString());
	}
	
	
	/**
	 * O(n/2) = O(n) - Time | O(1) - Space
	 * @param str
	 * @return
	 */
	public static boolean isPalindromeOptimized(String str) {
		if(null == str) {
			return true;
		}
		int start = 0;
		int end = str.length()-1;
		while(start < end) {
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
