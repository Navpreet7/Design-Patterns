package main.java.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7601485207540493334L;
	
	protected Object readResolve() {
		return getInstance();
	}
	private SerializedSingleton() {
		
		
	}
	private static class Helper{
		private  static final SerializedSingleton instance = new SerializedSingleton();
	}
	
	public SerializedSingleton getInstance() {
		return Helper.instance;
	}
}
