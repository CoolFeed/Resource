package gerry.java.basic;

import java.lang.reflect.Method;

public class Reflection {

	public static void printClassMethod(Object o){
		System.out.println(o.getClass());
		
		Class c = o.getClass();
		
		Method[] m = c.getMethods();
		
		if(m != null){
			for(int i=0; i < m.length; i++){
				System.out.println(m[i].toString());
			}
		}
		
	}
	
	public static void main(String[] args) {

		Reflection.printClassMethod("aaa");

	}

}
