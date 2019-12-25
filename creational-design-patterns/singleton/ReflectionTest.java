package main.java.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionTest {

	public static void main(String[] args) {
		EagerInitialized inst1 = EagerInitialized.getInstance();
		EagerInitialized inst2 = null;
		Constructor[] constructors = EagerInitialized.class.getDeclaredConstructors();
		for (Constructor constructor: constructors) {
			constructor.setAccessible(true);
			try {
				inst2 =(EagerInitialized) constructor.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		System.out.println(inst1.hashCode());
		System.out.println(inst2.hashCode());

	}

}
