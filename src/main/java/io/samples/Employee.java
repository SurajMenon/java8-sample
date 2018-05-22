package io.samples;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Employee {
	boolean isManager = false;
	String name = "myname";
	int salary = ThreadLocalRandom.current().nextInt(0,10000);
	
	public Employee(String name,boolean isMgr) {
		this.isManager=isMgr;
		this.name=name;
	}
	
	public Employee() {
	}


	
	
	@Override
	public String toString() {
		return "Employee [isManager=" + isManager + ", name=" + name + ", salary=" + salary + "]";
	}

	public static boolean isManager(Employee e){
		return e.isManager;
	}
	
}