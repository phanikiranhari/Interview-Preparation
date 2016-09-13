package com.phani.arrays;

import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoArrays {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l2.add(4);
		l2.add(5);
		l2.add(6);
		l2.add(7);
		l2.add(9);

		Integer l1Length = l1.size();
		Integer l2Length = l2.size();

		while (i < l1Length && j < l2Length) {

			if (l1.get(i) < l2.get(j)) {
				System.out.print(l1.get(i) + " ");
				i++;
			} else if (l1.get(i) > l2.get(j)) {
				System.out.print(l2.get(j) + " ");
				j++;
			} else {
				System.out.print(l2.get(j) + " ");
				i++;
				j++;

			}

		}

		while (i < l1Length) {
			System.out.print(l1.get(i) + " ");
			i++;
		}
		while (j < l2Length) {
			System.out.print(l2.get(j) + " ");
			j++;
		}

	}

}
