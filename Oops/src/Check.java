
class A {
	int x=10;
	int y=20;
	int z=90;
}
class B extends A{
	int x=30;
	int y=40;
	int a=90;
}
public class Check{
	public static void main(String[] args) {
		B b=new B();
		A a=new B();
		System.out.println("B: "+b);
		System.out.println("A: "+a);
		b.x=50;
		b.y=60;
		System.out.println(a.x+" "+a.y+" "+a.z);
	}
}