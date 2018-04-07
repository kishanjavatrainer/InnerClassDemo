package com.infotech.client;

public class ClientTest {

	public static void main(String[] args) {
		
		OuterClass.InnerClass innerObj = new OuterClass().new InnerClass();
		
		innerObj.invoke();
	}

}
