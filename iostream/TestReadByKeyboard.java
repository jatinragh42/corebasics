package in.co.rays.iostream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestReadByKeyboard {
	
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isReader = new InputStreamReader(System.in);
		
		BufferedReader in = new BufferedReader(isReader);
		
		PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\HP\\Desktop\\io\\jatin.txt"));
		
		String Line = in.readLine();
		while(!Line.equals("quit")) {
			out.println(Line);
			Line = in.readLine();
			
		}
		out.close();
		in.close();
	}

}
