
public class Test1 {
	public static void main(String[] args){
		try{
			doStuff();
		}
		catch(InterruptedException a) {
			
		}
	}
	public static void doStuff() throws InterruptedException{
		doMoreStuff();
		System.out.println("doStuff");
	}
	public static void doMoreStuff()throws InterruptedException{
		Thread.sleep(3000);
	}
}
