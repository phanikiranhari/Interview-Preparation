package com.phani.stringExamples;

/*Finding a string if it has all unique characters*/

public class FindIfStringHasAllUniqueCharacters {

	/*
	 * We take a boolean array of length equal to total ascii characters which
	 * is equal to 128 Initially all boolean values are set to false. Now we
	 * iterate through the entire string and set the corresponding boolean value
	 * to true. By doing this if a same character occurs again boolean value is
	 * already set to true There by notifying us that the uniqueness is lost
	 */
	public static void main(String[] args) {
		String test = "abcdefghijklAmnopqrstuvwxyzA";
		boolean char_set[] = new boolean[128];
		for (int i = 0; i < test.length(); i++) {
			int value = test.charAt(i);
			if (char_set[value] == false) {
				char_set[value] = true;
			} else {
				System.out.println(test.charAt(i)
						+ " is the first character to be repeated");
				System.out.println("Hence String is not unique");
				System.exit(0);
			}
		}
		System.out.println("String is Unique");
	}
}
