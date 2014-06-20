package com.test;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Question3 {

	public static void main(String[] args) {

		calculatePercentile();
	}

	public static void calculatePercentile() {
		Integer[] array = { 8, 6, 6, 20, 9, 1, 12, 16, 3, 16, 22, 2 };
		int arrayLen = array.length;
		double percentile = 0;
		Set<Integer> uniqueSet = new TreeSet<Integer>();
		Collections.addAll(uniqueSet, array);

		for (Integer integer : uniqueSet) {
			double count = 0;
			for (int i = 0; i < arrayLen; i++) {
				if (integer == array[i])
					count++;
			}
			percentile += count * 100 / arrayLen;
			System.out.println(Math.round(percentile)
					+ "% of the numbers are less than or equal to " + integer);
		}

	}

}
