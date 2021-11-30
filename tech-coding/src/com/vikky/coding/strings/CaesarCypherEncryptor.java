package com.vikky.coding.strings;

/**
 * Given a non-empty string of lowercase letters and a non-negative integer
 * representing a key, write a function that returns a new string obtained by
 * shifting every letter in the input string by k positions in the alphabet,
 * where k is the key.
 *
 */
public class CaesarCypherEncryptor {

	public static void main(String[] args) {
		System.out.println(caesarCypherEncryptor("zzz", 1));
		System.out.println(caesarCypherEncryptor("xyz", 1));
		System.out.println(caesarCypherEncryptor("ovmqkwtujqmfkao", 52));
	}

	/**
	 * O(n) time | O(n) space
	 * @param str
	 * @param key
	 * @return
	 */
	public static String caesarCypherEncryptor(String str, int key) {
		char[] arr = str.toCharArray();
		int minVal = (int) 'a' - 1;
		int maxVal = (int) 'z';
		int newKey = key % 26;
		for (int i = 0; i < arr.length; i++) {
			int intVal = (int) arr[i] + newKey;
			if (intVal > maxVal) {
				intVal = minVal + (intVal - maxVal);
			}
			arr[i] = (char) (intVal);
		}
		return new String(arr);
	}
}
