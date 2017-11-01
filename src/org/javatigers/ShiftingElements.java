package org.javatigers;

public class ShiftingElements {
	public static void main(String[] args) {
		int[] arr = {6,3,7,8,9};
		
		shiftElements(arr, 3);
	}

	private static void shiftElements(int[] arr, int k) {
		if(arr.length>0){
			while(k>0){
				
				int temp = arr[arr.length-1];
				for(int i = arr.length-1; i>0; i--){
					arr[i] = arr[i-1];
				}
				arr[0] = temp;
				k--;
			}
		}
		
		for(int x :arr){
			System.out.print(x+"\t");
		}
	}
	
	

}
