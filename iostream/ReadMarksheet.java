package in.co.rays.iostream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadMarksheet {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\io\\jatin.txt");
		
		ObjectInputStream in = new ObjectInputStream(file);
		
		Marksheet m = (Marksheet) in.readObject();
		
		System.out.println(m.name);
		System.out.println(m.chemistry);
		System.out.println(m.physics);
		System.out.println(m.maths);
		
		in.close();
		file.close();
		
		
		
		
	}

}
