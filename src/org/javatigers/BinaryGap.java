package org.javatigers;

import java.util.stream.Stream;

public class BinaryGap {

	public static void main(String[] args) {
		System.out.println(getBinaryGap(15));
		
		Stream
        .of(Integer.toBinaryString(1041).split("1"))
        .map(String::length)
        .max(Integer::compare)
        .orElse(0);
	}
	
	public static int getBinaryGap(int number){
		int binaryGap = 0;
	    String binaryString = Integer.toBinaryString(number);
	    char[] characters = binaryString.toCharArray();  
	    int j = 0;
	    Character c;
	    for (int i = 0; i < characters.length; i++) {
	         c = characters[i];
	        if (c.equals('0')) {
	            j += 1;
	        }

	        if (c.equals('1')) {
	            if (j > binaryGap ){
	                binaryGap = j;
	            }
	            j = 0;
	        }

	    }
	    return binaryGap;
	}
}
