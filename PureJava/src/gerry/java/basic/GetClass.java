package gerry.java.basic;

import java.util.Date;

public class GetClass extends Date {
	public static void main(String[] args) {
		new GetClass().test();
	}

	public void test() {
		System.out.println(super.getClass().getName());
		//ºÜÆæ¹ÖµÄÊä³ö"GetClass"
	}
}
