package org.javatigers;

public class CheckPermutation {
	public static void main(String[] args) {
		int i =  checkPermutation(new int[]{4,3,2});
		if(i==1){
			System.out.println("Permutation");
		}else{
			System.out.println("Not Permutation");
		}
	}
	
	public static int  checkPermutation(int[] A){
		 int[] counter = new int [A.length];
	        for(int i= 0; i< A.length; i++){
	            if (A[i] < 1 || A[i] > A.length) {
	                // Out of range
	                return 0;
	            }
	            else if(counter[A[i]-1] == 1) {
	            	
	                // met before
	                return 0;
	            }
	            else {
	                // first time meet
	                counter[A[i]-1] = 1;
	            }
	        }
	        return 1;
	}

}
