package com.test;

public class Question2 {
	
	public static void main(String[] args) {

		System.out.println(convertColorToHexadecimal(68, 58, 197));
	}
	
	public static String convertColorToHexadecimal(int r, int g, int b) {
		String hexCode = "#" + Integer.toHexString(r) + Integer.toHexString(g)
				+ Integer.toHexString(b);
		return hexCode;
	}

}
