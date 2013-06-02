package java.basic;

class Base {
	static int a=1;
	public Base(){
	   System.out.println(" 55555");
	}
	static {
	   System.out.println("init Base");
	}
	static void method(){
	   System.out.println("Base");
	}

	}
	class Sub extends Base{

	public Sub(){
	   System.out.println(" 44444");
	}
	static final int b=2;
	static {
	   System.out.println(" init Sub");
	}
	}

	public class Traversc {
	public static void main(String[] args){
	  // Sub.method();
	   System.out.println("a="+Sub.b);
	}
	}