package com.phani.stringExamples;

public class StringWithCharacterCount {
	
	public static void main(String[] args) {
		String str = "aaabbbcccd";
		StringBuffer sb = new StringBuffer();
		int counter =1;
		int i =0;
		int length = str.length()-1;
		System.out.println(str.length());
		while (i<=length){
			if (i+1 < length+1 && str.charAt(i) == str.charAt(i+1)){
				counter = counter+1;
			}
			else{
				sb.append(str.charAt(i));
				sb.append(counter);
				counter =1;
			}
		i++;
		}
		System.out.println(sb);
	}

}
