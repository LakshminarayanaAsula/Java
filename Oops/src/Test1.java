
public class Test1{
	int a,b;
	void m1(Test1 t2) {
		int a,b;
		System.out.println("sub");
		a=5;
		b=6;
		t2.a=10;
		t2.b=20;
		System.out.println(a+" "+t2.b);
	}
	public static void main(String[] args) {
		Test1 t1=new Test1();
		Test2 t2=new Test2();
		t1.m1(t2);
	}
}
