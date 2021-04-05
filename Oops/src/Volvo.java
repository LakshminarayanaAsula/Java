
public class Volvo extends AbstractionTest {
	void engine() {
		System.out.println("Volvo engine fixed");
	}
	void wheels(String name) {
		System.out.println("breaks fixed");
	}
}
class Test{
	public static void main(String[] args) {
		AbstractionTest at=new Redbus();
		at.wheels("redbus");
		at.engine();
	/*	at.breaks("redbus");
		at.engine();
		AbstractionTest v=new Volvo();
		v.wheels("volvo");
		v.breaks("volvo");
		v.engine(); */
	}
}
