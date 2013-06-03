package gerry.java.basic;

public class TestFloat {

	public static void main(String[] args) {
		Float a = new Float(3.4);
		System.out.println(a.SIZE);
		a = new Float(34000);
		System.out.println(a.SIZE);

		String a1 = "gone with wind";
		String b = "wind";
		String c = a1.toUpperCase();

		int test = 1;

		String cc = "I am a student";
		String dd = "I am";
		String ee = dd + " a student";

		if (cc == ee) {
			System.out.println("cc is equal to ee");
		} else if (cc.equals(ee)) {
			System.out.println("false");
		}

		if (cc == "I am a student") {
			System.out.println("equal to a final string");
		}
	}

	static class inC {

	}
}
