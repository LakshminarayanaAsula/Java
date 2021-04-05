public class BiggestNum {
	public static void bigNum(int a,int b,int c) {
		if(a>b)
			if(a>c)
				System.out.println("a is big, a: "+a);
			else
				System.out.println("c is big, c: "+c);
		else if(b>c)
				System.out.println("b is big, b: "+b);
			else
				System.out.println("c is big, c: "+c);
	}
	public static void main(String[] args) {
		int a=50,b=10,c=20;
		bigNum(a,b,c);
	}

}
