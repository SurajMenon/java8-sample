package io.javascript;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import javax.script.Bindings;
import javax.script.Invocable;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

// See: http://winterbe.com/posts/2014/04/05/java8-nashorn-tutorial/
public class JSDemo {

	public static void main(String[] args) throws ScriptException, FileNotFoundException, NoSuchMethodException {

		ScriptEngineManager sem = new ScriptEngineManager();
		ScriptEngine engine = sem.getEngineByName("Nashorn");

		engine.eval("print( 'Hello world !' );");

		// First line defines function, next executes
		engine.eval("function myFun(s) {print(s)}");
		engine.eval("myFun('Hello, world from method !')");

		// Execute a js file
		FileReader reader = new FileReader("src/main/resources/print.js");
		engine.eval(reader);

		// Execute a js file with arg from java
		FileReader reader2 = new FileReader("src/main/resources/print-with-arg.js");
		Bindings bind = engine.getBindings(ScriptContext.ENGINE_SCOPE);
		bind.put("name", " with args");
		engine.eval(reader2);
		
		// Execute method of a js file.
		// Note : print-with-arg.js contains multiply function
		Invocable invocable = (Invocable) engine;
		Object result = invocable.invokeFunction("multiply", 5 , 2);
		System.out.println(result);
	}

}
