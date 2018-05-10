package dev.bacoder.kr;

public class SungJuk {
	private String Std_num;
	private String Std_name;
	private int kor, eng, mat;
	
	
	//getter or setter
	
	
	
	
	public int  Sum(){
		System.out.println("합계는  "+(kor+ eng+ 								mat)+"입니다");
		return kor + eng + mat;
	}

	public void Ave(){
		System.out.println("평균은  "+(Sum()/3) +"입니다");
	}

	public String getStd_num() {
		return Std_num;
	}

	public void setStd_num(String std_num) {
		Std_num = std_num;
	}

	public String getStd_name() {
		return Std_name;
	}

	public void setStd_name(String std_name) {
		Std_name = std_name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

}
