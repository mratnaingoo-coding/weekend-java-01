package com.jdc.enum_pkg;

public class EnumWithMembersData {
	public static void main(String[] args) {
		//showAction(Calculator.ADD);
		
		takeAction();
		for(var c: Calculator.values()) {
			showAction(c);
		}
	}
	
	static void showAction(Calculator c) {
		//System.out.println(c);
		System.out.println(c.getFullName());
		
	}
	
	static void takeAction() {
		System.out.println("=======Result============");
		System.out.println(Calculator.ADD.calculate(100, 20));
		System.out.println(Calculator.SUB.calculate(100, 20));
		System.out.println(Calculator.MUL.calculate(100, 20));
		System.out.println(Calculator.DIV.calculate(100, 20));
		System.out.println("=========================");
	}
}

enum Calculator{
	ADD("Addition"){
		@Override
		int calculate(int a, int b) {
			return a + b;
		}
	}, 
	SUB("Subtraction"){
		@Override
		int calculate(int a, int b) {
			return a - b;
		}
	}
	, 
	MUL("Multiplication"){
		@Override
		int calculate(int a, int b) {
			return a * b;
		}
	}, 
	DIV("Division"){
		@Override
		int calculate(int a, int b) {
			return a / b;
		}
	};
	
	private String fullName;
	
	Calculator(String fullname) {
		this.fullName = fullname;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	abstract int calculate(int a, int b);


}