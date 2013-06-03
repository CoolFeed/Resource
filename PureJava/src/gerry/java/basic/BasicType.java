package gerry.java.basic;

public class BasicType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean bl;
		byte b = 1;
		char c;
		int i;
		float f;
		long l;
		double d;

		Boolean a1= new Boolean(true), b1= new Boolean(true);
		Byte b2 = 1, b3 = 1;
		Character c1='c', c2= 'c';
		Integer i1= new Integer(1), i2= new Integer(2);
		Float f1 = 1f, f2 = 1f;
		Long l1 =1l, l2= 1l;
		Double d1 = new Double(1), d2= new Double(2);
		
		System.out.println("Boolean: " + (a1 == b1));
		System.out.println("Byte: " + (b2 == b3));
		System.out.println("Integer: " +(i1 == i2));
		System.out.println("Float: " + (f1 == f2));
		System.out.println("Long: " +(l1 == l2));
		System.out.println("Double: " + (d1 == d2));
	}

}
