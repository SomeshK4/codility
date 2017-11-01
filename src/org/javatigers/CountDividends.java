package org.javatigers;

public class CountDividends {
	public static void main(String[] args) {
		System.out.println(solution(6, 11, 2));
		
	}
	
	public static int solution(int A, int B, int K){
		if (A % K == 0){
            return (B / K) - (A / K) + 1;
		}
		else
			return (B / K) - (A / K);
		
		//http://www.geeksforgeeks.org/count-numbers-divisible-m-given-range/
	}

}
