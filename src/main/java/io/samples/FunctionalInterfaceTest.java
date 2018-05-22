package io.samples;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceTest {

	public static void main(String args[]) {
		Employee e1 = new Employee("Boss", true);
		Employee e2 = new Employee("me", false);

		Predicate<Employee> isManager = (e) -> e.isManager;
		System.out.println(isManager.test(e1));
		System.out.println(isManager.test(e2));
		
		
		//Supplier<Employee> employeeFactory = () -> {return new Employee();};
		Supplier<Employee> employeeFactory = Employee::new;
		System.out.println(employeeFactory.get());
	}
}
