package java.basic;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Vector;

interface ICounter {
	public int a = 40;
}

public class JavaException implements ICounter {
	public static int a;

	public static void main(String[] args) {
		JavaException c = new JavaException();
		System.out.println(c.a);
		c.a = 50;
		System.out.println(c.a);
	}
}

class yy {
	public static void main(String[] ards) throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Caught in main()");
		}
		System.out.println("nothing");

		char c = 'a';
		switch (c) {
		case 'a':
			System.out.println("a");
		default:
			System.out.println("default");
		}
	}
}

class testException {
	public static void main(String args[]) {
		int n[] = { 0, 1, 2, 3, 4 };
		int sum = 0;
		try {
			for (int i = 1; i < 6; i++)
				sum = sum + n[i];
			System.out.println("sum=" + sum);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组越界");
		} finally {
			System.out.println("程序结束");
		}
		
		char[] s = new char[20];
		String str = "我 是 a b c d e 你 好";
		
		StringTokenizer st = new StringTokenizer(str);
		
        
		for(int t=0; t< st.countTokens(); t++){
			System.out.println(st.nextToken().toString());
		}
		
		String str2 = "qd我是谁si";
		
		System.out.println(str2.length());
		ArrayList a;
		Vector b;
		HashSet c;
		LinkedList d;
		
	}
}