
public class Test2 extends Test1 {
	{
		System.out.println("sub nonstatic");
	}
	static {
		System.out.println("sub static");
	}
	public static void main(String[] args) {
		System.out.println("sub main");
		Test1 t=new Test2();
		t.main(new String[1]);
	}

}
