package com.jdc.enum_pkg;

public class Person {
	private String name;
	private int age;
	private Gender gender;
	
	void showInfo() {
		System.out.println("Name: %s".formatted(name));
		System.out.println("Age: %d".formatted(age));
		System.out.println("Gender: %s".formatted(gender) );
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "Name";
		p.age = 20;
		p.gender = Gender.Male;
		p.showInfo();
	}
}

enum Gender{
	Male, Female
}