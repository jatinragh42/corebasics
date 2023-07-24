package in.co.rays.externizable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class ReadEmployee {

	public static void main(String[] args) throws Exception {
		
        FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\io\\jatin.txt");
		
		ObjectInputStream in = new ObjectInputStream(file);
		
		Employee22 e = (Employee22) in.readObject();
	
		System.out.println(e.id);
		System.out.println(e.firstname);
		System.out.println(e.lastname);
		System.out.println(e.salary);
		
		file.close();
		in.close();
		
		
	}
}
