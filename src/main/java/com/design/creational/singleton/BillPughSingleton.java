package com.design.creational.singleton;

public class BillPughSingleton {
	private BillPughSingleton() {

	}

	private static class Helper {
		private static final BillPughSingleton instance = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return Helper.instance;
	}

}
