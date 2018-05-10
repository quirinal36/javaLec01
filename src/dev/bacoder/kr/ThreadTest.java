package dev.bacoder.kr;

public class ThreadTest{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex t1=new Ex("첫번째 쓰레드");
		Ex t2=new Ex("두번째 쓰레드");
		t1.start();
		t2.start();
	}
}