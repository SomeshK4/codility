package org.javatigers;

public class FrogJumpAcrossRiver {

	public static void main(String[] args) {
		System.out.println(frogJump(new int[]{1,3,1,4,2,3,5,4}, 5));
	}
	
	public static int frogJump(int[] A, int X){
		 int steps = X;
	        boolean[] bitmap = new boolean[steps+1];
	        for(int i = 0; i < A.length; i++){
	            if(!bitmap[A[i]]){
	                bitmap[A[i]] = true;
	                steps--;
	            }
	            if(steps == 0) return i;
	        }
	        return -1;
	}
}
