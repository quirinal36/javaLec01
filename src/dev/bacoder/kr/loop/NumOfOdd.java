package dev.bacoder.kr.loop;

import javax.swing.JOptionPane;

public class NumOfOdd {

	public void execute(){
		int inputNum = Integer.parseInt(JOptionPane.showInputDialog("입력할 숫자의 갯수는?"));
		int count = 0;
		
		for(int i=0; i<inputNum; i++){
			int input = Integer.parseInt(JOptionPane.showInputDialog("판별할 숫자를 입력하세요."));
			if(input % 2 == 0){
				count ++;
			}
		}
		
		System.out.println("짝수의 갯수는 " + count + "개 입니다.");
	}
}
