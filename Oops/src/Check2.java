class A2{
	private static void m1() {
		System.out.println("super static method");
	}
	void m3() {
		System.out.println("super non static method");
	}
	final void m2(int i) {
		System.out.println("super Overloaded");
	}
	/*public final static void main(String[] args) {
		System.out.println("super main");
	}*/
}
public class Check2 extends A2{
	static void m4() {
		System.out.println("hiding");
	}
	final void m3() {
		System.out.println("riding");
	}
//}
//public class Check2 {

	public final static void main(String[] args) {
		
		A2 a=new Check2();
		//a.main(new String[1]);
		a.m3();
	}

}
