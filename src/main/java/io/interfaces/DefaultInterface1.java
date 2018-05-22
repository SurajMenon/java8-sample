package io.interfaces;

public interface DefaultInterface1 {
	
	public void getName();
	default void printName(){ System.out.println("name 1");}
	static void printStatic(){ System.out.println("static 1");}

}
