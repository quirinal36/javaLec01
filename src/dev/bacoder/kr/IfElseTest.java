package dev.bacoder.kr;

import javax.swing.JOptionPane;

public class IfElseTest {

	public static void main(String[] args) {
		int dat;
		String inputData = JOptionPane.showInputDialog("값입력:");
		dat = Integer.parseInt(inputData);
		
		if(dat % 10 == 0){
			System.out.println(dat+ "10의배수");
		}else{
			System.out.println(dat+ "10의배수 아님");
		}
	}
}
