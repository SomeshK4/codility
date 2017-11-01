package org.javatigers;

public class UnpairedElement {
	public static void main(String[] args) {
		int result = getUnpairedElement(new int[]{1,3,1});
		System.out.println(result);
	}
	
	public static int getUnpairedElement(int[] arr){
		int result = 0;
		for(int x: arr)
			result = result^x;
		
		return result;
	}
}
