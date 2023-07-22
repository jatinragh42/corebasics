package in.co.rays.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TestBinary {
	
	public static void main(String[] args) throws Exception {
		
		String source = "C:\\Users\\HP\\Desktop\\io\\jatin.txt";
		String target = "C:\\Users\\HP\\Desktop\\io\\rays.txt";
		
		FileInputStream f = new FileInputStream(source);
		
		FileOutputStream out = new FileOutputStream(target);
		
	    int i = f.read();
	    
	    while(i!=-1) {
	    	
	    	System.out.print(" "+i);
	    	out.write(i);
	    	i = f.read();
	    }
	    out.close();
	    f.close();
	    
	    System.out.println(source+"is copied to"+target);
	} 
	

}
