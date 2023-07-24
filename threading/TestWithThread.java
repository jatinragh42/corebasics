package in.co.rays.threading;

public class TestWithThread {
	
	public static void main(String[] args) {
		
		WithThread t1 = new WithThread("harshit");
		WithThread t2 = new WithThread("pawandeep");
		
		t1.start();
		t2.start();
		
		for (int i = 0; i<=5 ; i++) {
			System.out.println("main");
			
		}
		
	}

}
