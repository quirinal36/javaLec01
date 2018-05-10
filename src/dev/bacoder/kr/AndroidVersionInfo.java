package dev.bacoder.kr;

public class AndroidVersionInfo {
	public int id;
	private double ver_num;
	private int year;
	private String ver_name;
	private String ver_name_kor;
	private String alphabet;
	
	
	
	public AndroidVersionInfo(int id, String alphabet) {
		super();
		this.id = id;
		this.alphabet = alphabet;
	}

	public AndroidVersionInfo() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getVer_num() {
		return ver_num;
	}
	public void setVer_num(double ver_num) {
		this.ver_num = ver_num;
	}
	public int getYear() {
		
		return year;
	}
	public void setYear(int year) {
		if(year > 2018){
			System.out.println("잘못 들어옴 다시 입력하세요.");
		}
		this.year = year;
	}
	public String getVer_name() {
		return ver_name;
	}
	public void setVer_name(String ver_name) {
		this.ver_name = ver_name;
	}
	public String getVer_name_kor() {
		return ver_name_kor;
	}
	public void setVer_name_kor(String ver_name_kor) {
		this.ver_name_kor = ver_name_kor;
	}
	public String getAlphabet() {
		return alphabet;
	}
	public void setAlphabet(String alphabet) {
		this.alphabet = alphabet;
	}
	
	
}
