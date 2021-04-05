
public class Test1 {
	static Test1 t1;
	static Test1 t2;
	Test1 t3;
	Test1 t4;
	public static void main(String[] args) {
		Test1 t5;
		Test1 t6;
		Test1 t=new Test1();
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t.t3);
		System.out.println(t.t4);
		t5=new Test1();
		t6=new Test1();
		System.out.println(t);
		System.out.println(t5);
		System.out.println(t6);
	}
}
