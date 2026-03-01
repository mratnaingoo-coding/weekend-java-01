package com.jdc.enum_pkg;

public class BeforeEnum {
	public static void main(String[] args) {
		System.out.println(Day.MON);
		
		int monday = Day.MON;
		monday ++;
		System.out.println(monday);
		
	}
	
	static void showDay(int d) {
		System.out.println(d);
	}
}

interface Day{
	public static final int MON = 1;
	public static final int TUE = 2;
	public static final int WED = 3;
	public static final int THU = 4;
	public static final int FRI = 5;
	public static final int SAT = 6;
	public static final int SUN = 7;
}