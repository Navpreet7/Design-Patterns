package main.java.prototype;

import java.util.ArrayList;

public class PrototypeTest {

	public static void main(String[] args) {
		Employees emp = new Employees(new ArrayList<String>());
		emp.loadData();
		System.out.println(emp.getEmpList());
		Employees emp1 = (Employees) emp.clone();
		emp1.getEmpList().remove(1);
		System.out.println(emp1.getEmpList());
	}

}
