package io.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String args[]) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		// 1. forEach()
		// takes Consumer as argument (return type is null)
		Stream<Integer> s = list.stream();
		s.forEach(x -> System.out.print(x));
		System.out.println();

		// 2. filter(). Note new stream created
		// takes Predicate as argument
		list.stream().filter(x -> x % 2 == 0).forEach(y -> System.out.print(y));
		System.out.println();

		// 3. parellStream(). Note that order is changed
		list.parallelStream().forEach(x -> System.out.print(x));
		System.out.println();

		// 4. Stream.of() . Note: this does not work for primitive data types
		Integer[] arr = { 1, 2, 3, 4, 5, 1, 2 };
		System.out.println(Stream.of(arr).distinct().count());

		// 5. collect() : Streams to list. Note: Writing comparators is simple
		List<Integer> newList = list.stream().sorted((x, y) -> y - x).collect(Collectors.toList());
		System.out.println(newList);

		// 6. map()
		// takes Function as argument
		List<Integer> tenXList = newList.stream().map(x -> x * 10).collect(Collectors.toList());
		System.out.println(tenXList);
		
		// 7. reduce(): Single op from entire list
		System.out.println(newList.stream().reduce((i,j)-> i+j).get());
		
		// 8. flatMap()
		// http://www.baeldung.com/java-difference-map-and-flatmap
		
		// Note that list is not modified
		// System.out.println(list);
	}

}
