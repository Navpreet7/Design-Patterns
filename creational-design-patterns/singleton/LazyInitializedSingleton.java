package main.java.singleton;

public class LazyInitializedSingleton {
	private static LazyInitializedSingleton instance;
	public static LazyInitializedSingleton getInstance() {
		if(instance==null) {
			instance=new LazyInitializedSingleton();
		}
		return instance;
	}

}
