package io.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String args[]) {

		List<Employee> elist = new ArrayList<>();
		elist.add(new Employee("Ram", true));
		elist.add(new Employee("Suraj", false));
		elist.add(new Employee("Mayank", true));
		elist.add(new Employee("Raj", false));

		// Example 1
		System.out.println("Managers are:");
		elist.stream().filter(Employee::isManager).forEach(x -> System.out.println(x.name));

		// Example 2
		System.out.println("\nTop 2 salaries are:");
		elist.stream().sorted((e1, e2) -> (e2.salary - e1.salary)).limit(2).forEach(System.out::println);

		// Example 3
		int sum = elist.stream().map(e -> e.salary).reduce((i, j) -> i + j).get();
		System.out.println("\nSum of salaries are:" + sum);

		// Example 4
		Employee min = elist.stream().min((e1, e2) -> (e1.salary - e2.salary)).get();
		System.out.println("\nMin Salary:" + min);

		// Example 5
		Set<Integer> set = elist.stream().map(e -> e.salary + 5000).filter(s -> s > 10000).collect(Collectors.toSet());
		System.out.println(set + "\n");

		// Example 6 : List to map
		// Note: No direct stream for map 
		Map<String, Employee> map = elist.stream().collect(Collectors.toMap(e -> e.name, e -> e));
		map.keySet().stream().forEach(x -> System.out.println(x + ":" + map.get(x)));

		// Example 7: Flatmap
		// Note: only used for stream of streams .. cannot handle normal input
		// See : http://www.baeldung.com/java-difference-map-and-flatmap
		List<List<String>> list = Arrays.asList(Arrays.asList("a","b"),Arrays.asList("c","d"));
		System.out.println("\n"+list.stream().flatMap(s->s.stream()).collect(Collectors.toSet()));
	}
}
