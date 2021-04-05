public class InheritanceExecFlow {
	static {
		System.out.println("super static block");
	}
	static int a=m3();
	InheritanceExecFlow(){
		System.out.println("super constructor");
	}
	int b=m5();
	{
		System.out.println("super nonstatic block");
	}
	static int m3() {
		System.out.println("super static variable");
		return 5;
	}
	int m5() {
		System.out.println("super nonstatic variable");
		return 7;
	}
	static void m1() {
		System.out.println("super static method");
	}
	void m2() {
		System.out.println("super nonstatic method");
	}
	
}
