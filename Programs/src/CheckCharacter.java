import java.util.*;
public class CheckCharacter {
	public static void check(char c) {
		switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':{
						System.out.println("given charcter is vowel");
						break;
			}
			default:System.out.println("given character is constant");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character:");
		char c=sc.next().charAt(0);
		sc.close();
		check(c);
	}

}
