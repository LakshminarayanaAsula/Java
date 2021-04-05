
public class BiggestArg {
	public static void bigArgs(int a,int b,int c,int d,int e) {
		if(a>b)
			if(a>c)
				if(a>d)
					if(a>e)
						System.out.println("a is Big, a: "+a);
					else
						System.out.println("e is big, e: "+e);
				else if(d>e)
						System.out.println("d is big, d: "+d);
				else
					System.out.println("e is Big, e: "+e);
			else if(c>d)
					if(c>e)
						System.out.println("c is big, c: "+c);
					else
						System.out.println("e is big, e: "+e);
			else if(d>e)
					System.out.println("d is big, d: "+d);
			else
				System.out.println("e is big, e: "+e);
		else if(b>c)
				if(b>d)
					if(b>e)
						System.out.println("b is big, b: "+b);
					else
						System.out.println("e is big, e: "+e);
				else if(d>e)
						System.out.println("d is big, d: "+d);
				else
					System.out.println("e is big, e: "+e);
		else if(c>d)
				if(c>e)
					System.out.println("c is big, c: "+c);
				else
					System.out.println("e is big, e: "+e);
		else if(d>e)
				System.out.println("d is big, d: "+d);
		else
			System.out.println("e is big, e: "+e);
	}
	public static void main(String[] args) {
		String x=args[0];
		String y=args[1];
		int a=Integer.parseInt(x);
		int b=Integer.parseInt(y);
		int c=9,d=1,e=55;
		bigArgs(a,b,c,d,e);

	}

}
