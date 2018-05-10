package dev.bacoder.kr;

public class Pointer {
	private int x;
	private int y;
	
	
	public Pointer(){
		this.x = 0;
		this.y = 0;
	}
	
	public Pointer(int in_x, int in_y){
		this.x = in_x;
		this.y = in_y;
	}
	
	
	
	public int getX() {
		return this.x;
	}
	public void setX(int in_x) {
		this.x = in_x;
	}
	public int getY() {
		return y;
	}
	public void setY(int in_y) {
		this.y = in_y;
	}	
	
	@Override
	public String toString() {
		return "x 값은 : " + x + " y 값은 : " + y;
	}
}
