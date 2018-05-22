package io.functional.interfaces;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {

	public static void main(String args[]) {

		FuctionalInterfaceEx fc = () -> {
			// Implementation of the single abstract method of interface
			System.out.println("hello");
		};
		fc.getName();

		FuctionalInterfaceExWithArg fc2 = (s) -> System.out.println("hello" + s);
		fc2.getName(" world");
		
		
		/// Examples from java.util.Function
		
		//1. Function :  R Function<T, R> { R apply(T t); }
		Function<Integer, String> myIntToString = (s) -> { return String.valueOf(s);}; 
		System.out.println("Class type is:" +myIntToString.apply(10).getClass());
		
		Function<String, Integer> myStringLength = String::length; //Equivalent to ... (s) -> { return s.length();};
		System.out.println("String length is:"+myStringLength.apply("three"));
		
		
		//2. Predicate : Predicate<T> boolean test(T t); }
		Predicate<Object> isBoolean = (obj) -> { 
			return obj.getClass().getName().equals(Boolean.class.getName());};
		System.out.println(isBoolean.test(true));
		System.out.println(isBoolean.test("str"));
		
		//3. Consumer
		
		//4. Supplier : Supplier<T> { T get();}
		Supplier<String> newString = () -> {return new String("hello"); };
		System.out.println(newString.get());
	}
}
