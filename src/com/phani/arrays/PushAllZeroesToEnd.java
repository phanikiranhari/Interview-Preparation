package com.phani.arrays;

public class PushAllZeroesToEnd {

	static int[] givenList = {9,5,8,0,2,1,0,0,3,7};
	//static int[] givenList = { 9, 0, 8 };

	public static void main(String[] args) {

		int[] modifiedList = pushAllZeroesToEnd(givenList);
		for (int j = 0; j < modifiedList.length; j++) {
			System.out.print(modifiedList[j]);
		}
	}

	private static int[] pushAllZeroesToEnd(int[] list) {
		int index1 = 0;
		int index2 = 0;

		while (index1 < list.length - 1) {
			if (list[index1] == 0) {
				if (list[index2] != 0) {
					// Swap the values
					int temp;
					temp = list[index1];
					list[index1] = list[index2];
					list[index2] = temp;
					if (index2 < list.length - 1) {
						index1 = index1 + 1;
						index2 = index1;
					}
					else{
						index1 = list.length-1;
						index2 = list.length-1;
					}
				} else {
					index2 = index2 + 1;
				}

			} else {
				index1 = index1 + 1;
				index2 = index2 + 1;
			}
		}
		return list;

	}
}
