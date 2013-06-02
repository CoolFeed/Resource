package java.basic;

class test {

	static {

		System.out.println("***");

	}

	public static final String a = "sss";

	public static String test() {

		return "###";

	}

}

public class Test1 {

	public static void main(String[] args) {

		System.out.println(test.a);

		System.out.println(test.test());
		System.out.println("######################");
		int[] out = new int[] { 4, 5, 6 };
		Test1.test(out);
		System.out.println(out[0]);
		System.out.println(out[1]);
		System.out.println(out[2]);

	}

	public static void test(int[] x) {
		x = new int[] { 1, 2, 3 };
	}
}
