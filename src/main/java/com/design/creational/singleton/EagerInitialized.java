package com.design.creational.singleton;

public class EagerInitialized {
	private static final EagerInitialized eagerInitialized = new EagerInitialized();

	private EagerInitialized() {

	}

	public static EagerInitialized getInstance() {
		return eagerInitialized;
	}

}
