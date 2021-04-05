
public class Test4 {
	static void m1() {
		try {
			//System.out.println(10/0);
			System.exit(0);
		}
		catch(ArithmeticException a) {
			//return 200;
		}
		finally {
			//return 300;
			System.out.println("finally");
		}
	}
	public static void main(String[] args) {
		//System.out.println(m1());
		m1();
	}
}
