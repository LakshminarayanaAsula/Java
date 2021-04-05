import java.util.*;
public class Sum {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String x=args[0];
		String y=args[1];
		int[] a=new int[5];
		int sum=0;
		a[0]=Integer.parseInt(x);
		a[1]=Integer.parseInt(y);
		System.out.println("enter elements: ");
		for(int i=2;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.print("sum of the numbers is :"+sum);
	}

}
