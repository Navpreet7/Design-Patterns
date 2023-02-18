/**
 * 
 */
package com.design.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author navpreet
 *
 */
public class MyTopic implements Subject {

	private String message;
	private boolean changed;

	private List<Observer> observerList;
	private final Object MUTEX = new Object();

	public MyTopic() {
		this.observerList = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer obj) {
		if (obj == null)
			throw new NullPointerException("Null Observer");
		synchronized (MUTEX) {
			if (!observerList.contains(obj))
				this.observerList.add(obj);
		}
	}

	@Override
	public void deregister(Observer obj) {
		synchronized (MUTEX) {
			this.observerList.remove(obj);
		}

	}

	@Override
	public void notifyObservers() {
		List<Observer> observerLocal = null;
		synchronized (MUTEX) {
			if (!changed)
				return;
			observerLocal = new ArrayList<>(this.observerList);
			this.changed = false;
		}
		for (Observer obj : observerLocal) {
			obj.update();
		}

	}

	@Override
	public Object getUpdate(Observer obj) {
		return this.message;
	}

	public void postMessage(String msg) {
		System.out.println("Message Posted to Topic:" + msg);
		this.message = msg;
		this.changed = true;
		notifyObservers();
	}

}
