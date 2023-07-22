package in.co.rays.iostream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;

public class TestReader {
	
	public static void main(String[] args) throws Exception {
		
		//TO PRINT JUST ONE LINE:-
		
		FileReader file = new FileReader("C:\\Users\\HP\\Desktop\\io\\jatin.txt");
		
		int i = file.read();
		
	while(i!=-1) {
		System.out.println(i);
		i = file.read();
	}
		
		file.close();
		
		
		
		//TO PRINT FULL LINE:-
		
		//FileReader file = new FileReader("C:\\Users\\HP\\Desktop\\io\\jatin.txt");
		
		//BufferedReader in = new BufferedReader(file);
		
		//String line = in.readLine();
		
		//while(line!=null) {
			//System.out.println(line);
			//line = in.readLine();
			//}
		//in.close();
		
		
		//FORLOOPREADER:-
		
		//FileWriter out = new FileWriter("C:\\Users\\HP\\Desktop\\io\\jatin.txt");
		
		//PrintWriter pw = new PrintWriter(out);
		
		//for (int i = 0; i < 5; i++) {
			//pw.println(i + "  hello this is me");
			}
		//out.close();
		//pw.close();
		

		//TO WRITE IN FILE :-
		//FileWriter out = new FileWriter("C:\\Users\\HP\\Desktop\\io\\jatin.txt");
		
		//out.write("this is one line");
		//out.write(" this is two line");
		
		//out.close();
		
		
	
		
			
		}
		
		
   


