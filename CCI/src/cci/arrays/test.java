package cci.arrays;

public class test  extends Thread{
	
	public void start() {
		System.out.println("S");
	}
	
	
	public void run() {
		System.out.println("R");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		test t1= new test();
		test t2= new test();
		
		t1.start();
		t2.start();

	}

	

}

