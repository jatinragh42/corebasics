package in.co.rays.iostream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteMarksheet {

	public static void main(String[] args) throws Exception{
	
		FileOutputStream file = new FileOutputStream("C:\\Users\\HP\\Desktop\\io\\jatin.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		
		Marksheet m = new Marksheet();
		m.name = "jatin";
		m.chemistry = 98;
		m.physics = 99;
		m.maths = 100;
		
		out.writeObject(m);
		file.close();
		out.close();
	}
}
