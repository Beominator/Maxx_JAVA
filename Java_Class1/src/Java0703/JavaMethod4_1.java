
package Java0703;

import java.util.Scanner;

public class JavaMethod4_1 {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		
	/*
	 	주사위 게임 (과제)
	 
	 j형준과 s석완이가 주사위 게임을 한다.
	 주사위는 하나, 육면이다.
	 주사위의 값이 큰 사람이 이긴다.
	 
	 주사위 값 구하는 메서드
	 
	 주사위 값 비교하여 누가 이겼는지 출력하는 메서드
	  
	  
	 */
		Dice dice=new Dice();
		
		int j형준Dice=dice.random();
		int s석완Dice=dice.random();
		
		
		System.out.println("j형준의 주사위 :"+j형준Dice);
		System.out.println("s석완의 주사위 :"+s석완Dice);
		dice.Dice(j형준Dice,s석완Dice);
		
	}

}

class Dice{
	
	int random() {
		int randomDice=(int)(Math.random()*6)+1;
		return randomDice;
	    }
	
	void Dice(int j형준Dice, int s석완Dice) {
		if(j형준Dice > s석완Dice) {
			System.out.print("j형준 승");
		}else if(j형준Dice < s석완Dice){
			System.out.print("s석완 승리");
		}else {
			System.out.print("무승부");
		}
	}
		
	
}
