
public class Test5 {

	public static void main(String[] args) {
		try {
			String s=null;
			Thread.sleep(2000);
			System.out.println(s.length());
			System.out.println(10/0);
		}
		catch(ArithmeticException | InterruptedException | NullPointerException ain) {
			throw new ArithmeticException();
		}
	}

}
