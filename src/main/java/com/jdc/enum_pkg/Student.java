package com.jdc.enum_pkg;

@lombok.Data
public class Student {
	String name;
	int age;
	
	public static void main(String[] args) {
		var s = new Student();
		s.setName("Mg Mg");
		s.setAge(18);
		
		System.out.println(s.getName());
		System.out.println(s.getAge());
		
	}
}
