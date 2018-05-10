package dev.bacoder.kr.loop;

import javax.swing.JOptionPane;

/**
 * 3,6,9 게임
 * 
 * @author leehg
 */
public class GameThree {

	/**
	 * 1 ~ 10 까지의 수 중 하나를 입력하여
	 * 그 순서대로 수를 출력하는데
	 * 3의 배수인 경우에만 대문자 X를 출력한다.
	 */
	public void play(){
		int input = Integer.parseInt(JOptionPane.showInputDialog("10보다 작은 정수를 입력하세요."));
		StringBuilder builder = new StringBuilder();
		
		for(int i=1; i<=input; i++){
			if(i%3 == 0){
				builder.append("X ");
			}else{
				builder.append(i).append(" ");
			}
		}
		
		System.out.println(builder.toString());
	}
}
