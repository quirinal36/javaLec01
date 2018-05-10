package dev.bacoder.kr;

public class RunnableTest{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam r1 = new Exam();
		Exam r2 = new Exam();
//		
//		Thread th1 = new Thread(r1);
//		Thread th2 = new Thread(r2);	
//		th1.start();
//		th2.start();
		
		new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("run()");
			}
		}.run();
		
	}
}