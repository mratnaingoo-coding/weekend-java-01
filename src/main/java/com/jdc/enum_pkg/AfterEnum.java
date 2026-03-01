package com.jdc.enum_pkg;

public class AfterEnum {
	public static void main(String[] args) {
		System.out.println(Days.MON);
	}
	static void showDay(Days d) {
		System.out.println(d);
	}
	
	
}

enum Days{
	MON, TUE, WED, THU, FRI, SAT, SUN
}

