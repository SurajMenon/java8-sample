package io.lambda;

import java.util.function.Function;

public class Lambda {
	
	public static void main(String args[]) {
		
		//// Types of lambda
		
		Function<Integer, Integer> fn = (Integer x) -> x+1;
		System.out.println(fn.apply(4));
		
		Function<Integer, Integer> fn2 = (x) -> x+1;
		System.out.println(fn2.apply(4));
		
		Function<Integer, Integer> fn3 = x -> x+1;
		System.out.println(fn3.apply(4));
		
		Function<Integer, Integer> fn4 = (Integer x)  -> { return x+1; };
		System.out.println(fn4.apply(4));
	}

}
