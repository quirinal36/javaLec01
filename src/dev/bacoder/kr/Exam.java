package dev.bacoder.kr;
class Exam implements Runnable {
	
	public void run() {
		for(int N=1; N<=5; N++){
			for(int j=1; j<=1000000000; j++){}
			System.out.println(Thread.currentThread().getName()+" -> "+N);
		}
	}
}
