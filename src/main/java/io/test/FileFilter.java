package io.test;

import java.io.File;

public class FileFilter {

    public static void main(String args[]){
        File[] list = new File(".").listFiles(File::isDirectory);
        list = new File(".").listFiles(u -> u.isDirectory());//Equivalent to above line
        
        System.out.println(list);
        //See : http://javainsimpleway.com/double-colon-operator-in-java-8/
        
    }
}
