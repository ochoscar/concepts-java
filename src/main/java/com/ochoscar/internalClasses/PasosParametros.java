package com.ochoscar.internalClasses;

public class PasosParametros {
	
	public static void main(String[] args) {
		int i = 1;
		Integer in = 1;
		String str = "1";
		StringBuilder sb = new StringBuilder("1");
		
		increment1(i);
		System.out.println(i);
		increment2(in);
		System.out.println(in);
		increment3(str);
		System.out.println(str);
		increment4(sb);
		System.out.println(sb);
	}
	
	public static void increment1(Integer i) {
		i++;
	}
	
	public static void increment2(int i) {
		i++;
		System.out.println(i);
	}
	
	public static void increment3(String i) {
		i += "1";
	}
	
	public static void increment4(StringBuilder i) {
		i.append("1");
	}

}
