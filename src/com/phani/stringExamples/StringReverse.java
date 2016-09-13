package com.phani.stringExamples;

/* Program to find a string reverse*/
public class StringReverse {
	/*
	 * We pass the given string to method that accepts a string. We simply
	 * iterate the string in reverse direction and append to a string buffer
	 * Finally after reaching the beginning of the string we return the formed
	 * string buffer
	 */
	public static void main(String[] args) {
		String givenString = "phanikiran";
		System.out.println("Actual String is " + givenString);
		StringBuilder reverseString = findReverseOfAString(givenString);
		System.out.println("Reversed String is " + reverseString);
	}

	private static StringBuilder findReverseOfAString(String str) {
		int length = str.length();
		StringBuilder sb = new StringBuilder();
		char[] charArray = str.toCharArray();
		for (int i = length - 1; i >= 0; i--) {
			sb.append(charArray[i]);
		}
		return sb;
	}
}
