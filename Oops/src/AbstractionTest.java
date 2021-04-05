
abstract class AbstractionTest implements InterfaceTest {
	abstract void engine();
	void breaks(String name) {
		System.out.println(name +" breaks fixed");
	}
	void wheels(String name) {
		System.out.println(name+ " wheels are fixed");
	}
}
