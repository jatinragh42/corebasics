package in.co.rays.threading;

public class WithoutThread {

	String name = null;
	
	public WithoutThread(String name) {
		this.name = name;
	}
	
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i+name);
			
		}
	}
}
