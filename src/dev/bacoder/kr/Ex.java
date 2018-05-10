package dev.bacoder.kr;

class Ex extends Thread{
	public Ex(String name){
		super(name);
	}

	public void run(){
		for(int N=1; N<=5; N++){ //오랜시간 실행시키기위한 블록
			for(int j=1; j<=100000000; j++);
			System.out.println(getName()+" -> "+N);
		}
	}
}

