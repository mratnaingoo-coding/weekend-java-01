package com.jdc.enum_pkg;

public class EnumWithInterface {

	public static void main(String[] args) {
		showWorks();
		showTakeTheTime();
	}
	
	static void showWorks() {
		System.out.println("==============================");
		System.out.println(Position.manager.doWork());
		System.out.println(Position.waitor.doWork());
		System.out.println(Position.chef.doWork());
		System.out.println(Position.delivery.doWork());
		System.out.println("==============================");
	}
	static void showTakeTheTime() {
		System.out.println("==============================");
		Position.manager.takeInTime();
		Position.waitor.takeInTime();
		Position.chef.takeInTime();
		Position.delivery.takeInTime();
		System.out.println("==============================");
	}

}

interface Loggable{
	String doWork();
}
enum Position implements Loggable{
	manager("do manage inventory."){
		@Override
		void takeInTime() {
			System.out.println("Hello manager, Take in time.");
		}
	}, 
	waitor("serve the customer"){
		@Override
		void takeInTime() {
			System.out.println("Hello waitor, Take in time.");
		}
	}, 
	chef("do cook for customer."){
		@Override
		void takeInTime() {
			System.out.println("Hello chef, Take in time.");
		}
	}, 
	delivery("sent the order."){
		@Override
		void takeInTime() {
			System.out.println("Hello delivery, Take in time.");
		}
	};
	
	private String job;
	
	private Position(String job) {
		this.job = job;
	}
	
	@Override
	public String doWork(){
		return this.job;
	}
	
	abstract void takeInTime();
	
}