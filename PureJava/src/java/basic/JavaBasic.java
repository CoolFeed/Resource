package java.basic;
import java.util.concurrent.CopyOnWriteArrayList;

public class JavaBasic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean one = new Boolean(true);
		Boolean two = new Boolean(true);
		System.out.println(one == two);
        Object o = new Object();
        System.gc();
        ThreadLocal local;
        CopyOnWriteArrayList list = null;
        list.iterator();
	}

}