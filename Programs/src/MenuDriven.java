import java.util.*;
public class MenuDriven {
	public static void operations(int a, int b,int n) {
		int c;
		switch(n) {
			case 1:{
				c=a+b;
				System.out.println("Addition of two numbers is:"+c);
				break;
			}
			case 2:{
				c=a-b;
				System.out.println("Subtraction of two numbers is:"+c);
				break;
			}
			case 3:{
				c=a*b;
				System.out.println("Multiplication of two numbers is:"+c);
				break;
			}
			case 4:{
				c=a/b;
				System.out.println("division of two numbers is:"+c);
				break;
			}
			default:System.out.println("Invalid option");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("1. Addition %n2. Subtraction %n3. Multiplication %n4. division%n");
		System.out.println("enter a,b values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("choose an option");
		int n=sc.nextInt();
		operations(a,b,n);
		sc.close();
	}

}
