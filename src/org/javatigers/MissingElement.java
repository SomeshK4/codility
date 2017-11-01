package org.javatigers;

public class MissingElement {
	public static void main(String[] args) {
		int number = missingElement(new int[]{1,2,4,5});
		
		//int number = missingElementWithGoodPerf(new int[]{-1,-3});
		System.out.println(number);
	}

	private static int missingElement(int[] arr) {
		int length = arr.length+1;
		int n = length*(length+1)/2;
		
		int sum = 0;
		for(int i = 0;i<arr.length;i++){
			sum = sum+arr[i];
		}
		
		return n -sum;
	}
	/**
	 * Pigeon Hole principle
	 * @param A
	 * @return
	 */
	private static int missingElementWithGoodPerf(int[] A){
		int N = A.length+1;
        boolean[] numPresent = new boolean[N + 1];
        for (int i = 1; i < N; i++) {
            if (A[i-1]==  N) {
                continue;
            }
 
            if (!numPresent[A[i-1]]) {
                numPresent[A[i-1]] = true;
            }
        }
 
        int smallest = 1;
        for (int j = 1; j < numPresent.length; j++) {
 
            if (!numPresent[j]) {
                smallest = j;
                break;
            }
            smallest++;
        }
        return smallest;
	}

}
