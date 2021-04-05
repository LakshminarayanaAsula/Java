import java.io.*;
public class FileCreation {

	public static void main(String[] args)throws IOException {
		/*File f=new File("abc.text");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());*/
		File f=new File("Lachi.txt");
		f.mkdir();
		File f2=new File("lachi.txt","abc.txt");
		f2.createNewFile();
	}

}
