package com.phani.stringExamples;

import java.util.Arrays;

//Program to find out if 2 strings given are Anagrams
public class StringAnagrams {

	public static void main(String[] args) {
		String string1 = "aab";
		String string2 = "abb";

		boolean result = areStringsAnagrams(string1, string2);
		if (result) {
			System.out.println("Yes the 2 strings are Anagrams");
		} else {
			System.out.println("The 2 strings are not Anagrams");
		}
	}

	private static boolean areStringsAnagrams(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		} else {
			//System.out.println("Sorted first string is " + sort(str1));
			//System.out.println("Sorted Second String is " + sort(str2));
			return sort(str1).equals(sort(str2));
		}

	}

	private static String sort(String str) {
		char[] charArray = str.toLowerCase().toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}
}
