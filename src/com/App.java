package com;

public class App {

	public static void main(String[] args){
		System.out.println(Singleton.getInstance());
		System.out.println(ThreadSafeSingleton.INSTANCE);
		System.out.println(DoubleCheckedLockingSingleton.getInstance());
		
	}
}
