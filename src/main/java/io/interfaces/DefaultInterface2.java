package io.interfaces;

public interface DefaultInterface2 {
	
	public void getName();
	default void printName(){ System.out.println("name 2");}
	static void printStatic(){ System.out.println("static 2");}

}
