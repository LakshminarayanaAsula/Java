
public class DaemonThread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());
		//Thread.currentThread().setDaemon(true);
		Thread.currentThread().setDaemon(true);
		
		}

}
