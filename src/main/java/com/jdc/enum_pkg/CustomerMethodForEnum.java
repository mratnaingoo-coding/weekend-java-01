package com.jdc.enum_pkg;

public class CustomerMethodForEnum {

	public static void main(String[] args) {
			Data typeValue = Data.valueOf("ONE");
			System.out.println(typeValue);
			
			Data [] dArr = Data.values();
			for(var d: dArr) {
				System.out.println(d + " ");
			}
			
			var strName = Data.ONE.name();
			System.out.println(strName.equals("ONE"));
			
			var index = Data.ONE.ordinal();
			System.out.println(index == 0);
			
	}

}

enum Data{
	ONE, TWO
}