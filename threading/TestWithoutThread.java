package in.co.rays.threading;

public class TestWithoutThread {
	
	public static void main(String[] args) {
		
		WithoutThread t1 = new WithoutThread("jatin");
		WithoutThread t2 = new WithoutThread("ayush");
		
		t1.run();
		t2.run();
		
	}

}
