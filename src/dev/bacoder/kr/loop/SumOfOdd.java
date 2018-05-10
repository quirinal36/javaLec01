package dev.bacoder.kr.loop;

import javax.swing.JOptionPane;

/**
 * 짝수의합을 구하는 프로그램
 * @author leehg
 */
public class SumOfOdd {

	/**
	 * 입력된 값까지 순차적으로 올라가며
	 * 짝수일 때만 합계를 내도록 하는것
	 */
	public void showMe(){
		System.out.println("짝수 합 구하기");
		
		int sum = 0;
		int input = Integer.parseInt(JOptionPane.showInputDialog("수를 하나 입력 하세요."));
		int i = 1;
		
		while(i < input){
			if(i%2 == 0){
				System.out.print(i + "+");
				sum += i;
			}
			i++;
		}
		System.out.println("=" + sum);
	}
	
	/**
	 * 마지막 '+' 기호를 없애고 싶을 때
	 */
	public void showMeVer2(){
		System.out.println("짝수 합 구하기");
		
		int sum = 0;
		int input = Integer.parseInt(JOptionPane.showInputDialog("수를 하나 입력 하세요."));
		int i = 1;
		StringBuilder builder = new StringBuilder();
		
		while(i < input){
			if(i%2 == 0){
				builder.append(i).append("+");
				sum += i;
			}
			i++;
		}
		
		builder.append("=");
		builder.deleteCharAt(builder.lastIndexOf("+"));
		System.out.println(builder.toString() + sum);
	}
}
