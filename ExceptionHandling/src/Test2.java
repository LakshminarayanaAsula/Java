
public class Test2 {

	public static void main(String[] args) {
		try {
			System.out.println("outer try");
			try {
				System.out.println("inner try");
				System.out.println(10/0);
			}
			catch(NullPointerException e) {
				System.out.println("inner catch");
			}
			System.out.println("outer try");       
		}
		catch(ArithmeticException ae) {
			System.out.println("outer catch");
			//ae.printStackTrace();
			//System.out.println(ae.toString());
			//System.out.println(ae.getMessage());
		}
		finally {
			System.out.println("finally");
		}
	}
}
