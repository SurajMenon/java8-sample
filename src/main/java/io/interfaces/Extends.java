package io.interfaces;

public class Extends implements DefaultInterface1,DefaultInterface2{

	@Override
	public void printName() {
		//Needs to be overridden as both interface have printName() method
		DefaultInterface1.super.printName();
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub
	}
	
	public static void main(String args[]){
		
		DefaultInterface1 d1 = new Extends();
		d1.printName();
		//d1.printStatic() : Static methods cannot be called on obj's. It needs to be called on interface
		
		DefaultInterface1.printStatic();
		DefaultInterface2.printStatic();
	}
}
