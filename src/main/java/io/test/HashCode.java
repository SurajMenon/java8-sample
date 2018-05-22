package io.test;

public class HashCode {

    public static void main(String args[]){
        
    	/**1**/
    	Integer i1=new Integer(10);
    	Integer i2=new Integer(10);
    	System.out.println("1:"+ (i1==i2));
    	
    	
    	/**2**/
    	Integer i3=10;
    	Integer i4=10;
    	System.out.println("2:"+ (i3==i4));
    	
    	/**3**/
    	//Integer range from -128 to 127 are pooled (Byte range). 
    	//Hence 2 gives true but this gives false
    	Integer i5=200;
    	Integer i6=200;
    	System.out.println("3:"+ (i5==i6));
    	
    	
    	/**4**/
    	String s1="Abc";
    	String s2="Abc";
    	System.out.println("4:"+ (s1==s2));
    	
    	
    	/**5**/
    	String s3=new String("Abc");
    	String s4=new String("Abc");
    	System.out.println("5:"+ (s3==s4));
    }
}
