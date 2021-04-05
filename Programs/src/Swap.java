
public class Swap {
	public static void swapTemp(int a, int b) {
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("swapping two variables using temp variable: ");
		System.out.println("a: "+a+"	"+"b: "+b);
	}
	public static void swapWoutTemp(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("swapping two variables without temp variable: ");
		System.out.println("a: "+a+"	"+"b: "+b);
	}
	public static void main(String[] args) {
		int a=10;
		int b=20;
		swapWoutTemp(a,b);
	}
}
