package com.infotech.client;

public class OuterClass {

	private int outerData = 1000;

	class InnerClass {
		private int innerData = 3000;
		public void invoke() {
			System.out.println("InnerClass:invoke method is Called:" + outerData);
			OuterClass.this.display();
		}
		public void display() {
			System.out.println("InnerClass:display method is Called..");
		}
	}

	public void display() {
		System.out.println("OuterClass:display method is Called..");
		InnerClass innerClass = new InnerClass();
		System.out.println("Accessing innerClass Data::"+innerClass.innerData);
	}
}
