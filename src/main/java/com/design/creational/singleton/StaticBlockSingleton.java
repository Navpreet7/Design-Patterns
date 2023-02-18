package com.design.creational.singleton;

public class StaticBlockSingleton {
	private static StaticBlockSingleton staticInstance;

	private StaticBlockSingleton() {

	}

	static {
		try {
			staticInstance = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public static StaticBlockSingleton getInstance() {
		return staticInstance;
	}

}
