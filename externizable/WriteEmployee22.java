package in.co.rays.externizable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteEmployee22 {
	
	public static void main(String[] args) throws Exception {
		
        FileOutputStream file = new FileOutputStream("C:\\Users\\HP\\Desktop\\io\\jatin.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Employee22 e = new Employee22();
		
		e.id = 1;
		e.firstname = "jatin";
		e.lastname = "Raghuwanshi";
		e.salary = "1000";
		
		out.writeObject(e);
		
		file.close();
		out.close();
	}

}
