package com;

public class Singleton {

	// threadsafe (final miatt)
	private static final Singleton singleton = new Singleton();
	
	private Singleton() {
		super();
	}

	public static Singleton getInstance(){
		return singleton;
	}

	@Override
	public String toString() {
		return "I'm the singleton";
	}
	
	
}
