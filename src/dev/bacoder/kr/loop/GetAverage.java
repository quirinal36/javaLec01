package dev.bacoder.kr.loop;

import javax.swing.JOptionPane;

public class GetAverage {

	public static void main(String[] args) {
		double input = 1.0;
		double sum = 0.0;
		double ave = 0.0;
		int count = 0;
		
		while(input != 0.0){
			input = Double.parseDouble(JOptionPane.showInputDialog("수를 입력하세요"));
			sum += input;
			count++;
		}

		ave = sum/count;
//		String.format("%.2f", ave)
		System.out.println("평균은 " + ave + " 입니다.");
	}

}
