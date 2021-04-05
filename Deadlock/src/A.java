class A {
	public synchronized void d1(B b) {
		System.out.println("Thread1 starts execution of m1 method");
		b.last();
	}
	public synchronized void last() {
		System.out.println("Inside A, last()");
	}
}
class B{
	public synchronized void d2(A a) {
		System.out.println("Thread2 starts Execution os m2 method");
		a.last();
	}
	public synchronized void last() {
		System.out.println("Inside b,last()");
	}
}
class Mythread extends Thread{
	A a=new A();
	B b=new B();
	public void m1() {
		this.start();
		a.d1(b);	// main thread responsibility
	}
	public void run() {
		b.d2(a);	// child thread responsibility
	}
	public static void main(String[] args) {
		Mythread t=new Mythread();
		t.m1();
	}
}