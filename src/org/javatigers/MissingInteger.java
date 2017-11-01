package org.javatigers;

import java.util.HashSet;

public class MissingInteger {
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 3, 6, 4, 1, 2 }));
	}

	public static int solution(int[] A) {
		int num = 1;
		HashSet<Integer> hset = new HashSet<Integer>();

		for (int i = 0; i < A.length; i++) {
			hset.add(A[i]);

			while (hset.contains(num)) {
				num++;
			}
		}

		return num;
	}

}
