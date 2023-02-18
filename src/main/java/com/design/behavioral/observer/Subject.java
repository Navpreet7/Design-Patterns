package com.design.behavioral.observer;



public interface Subject {
	public void register (Observer obj);
	public void deregister(Observer obj);
	
	public void notifyObservers();
	
	public Object getUpdate(Observer obj);
	

}
