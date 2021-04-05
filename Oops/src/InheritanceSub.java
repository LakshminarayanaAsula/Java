
public class InheritanceSub extends InheritanceExecFlow {
	static int x=m3();
	int y=m4();
	static {
		System.out.println("sub static block");
	}
	{
		System.out.println("sub nonstatic block");
	}
	static int m3() {
		System.out.println("sub static variable");
		return 20;
	}
	int m4() {
		System.out.println("sub nonstatic variable");
		return 40;
	}
	static void m1() {
		System.out.println("sub static method");
	}
	void m2() {
		System.out.println("sub nonstati method");
	}
	InheritanceSub(){
		System.out.println("sub constructor");
	}
	public static void main(String[] args) {
		System.out.println("main");
		InheritanceSub is=new InheritanceSub();
		System.out.println(x);
		System.out.println(a);
		System.out.println(is.b);
		System.out.println(is.y);
		System.out.println("main end");
	}
}
