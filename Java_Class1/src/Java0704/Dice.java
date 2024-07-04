package Java0704;

import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		
		
	}
	
class DiceGame{
	String[] names;
	int[] diceNum;
	
	void init() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주사위 게임 참가인원 : ");
		int cnt = sc.nextInt();
		this.names = new String[cnt];
		this.diceNum = new int[cnt];
		sc.nextLine();	// 버퍼 비우기 - 엔터
		for(int i=0; i<names.length; i++) {
			System.out.print("참가자 이름 : ");
			names[i] = sc.nextLine();
			
		}
	}
	
	void diceThrow() {		// 주사위 던지기	
		for(int i=0; i<names.length; i++) {
			this.diceNum[i] = (int)(Math.random()*6)+1;
			System.out.println(this.names[i]+ " 주사위 : " + this.diceNum[i]);
		}
		
	}
	void result() {		// 주사위 결과 - 주사위 값이 크면 이긴다.
		// 가장 큰 주사위값 찾기
		int max=0;
		for(int num : diceNum) {
			if( max < num) max = num;
		}
		// 모든 참가자들의 주사위 값이 같다면
		boolean isSame = true;
		for(int num : diceNum) {
			if (num != max) isSame = false;
		}
		if(isSame) {
			System.out.println(" 모든 참가자 주사위 값이 같다 - 비김");
			return;
		}
		
		// 가장 큰 주사위값 가지고 있는 사람들이 이긴다.
		for( int i=0; i<diceNum.length; i++) {
			if ( diceNum[1] == max) {
				System.out.println( names[i] + " 승 ");
			}
		}
	}

}
}
//		Dice game = new Dice();
//		int 석완 = game.getDice("석완");
//		int 형준 = game.getDice("형준");
//	}
//
//	
//	
//
//}

//class dice{
//	
//	void result(int 서, int 전) {
//		if (서 > 전) {
//			System.out.println("석완 승");
//		}else if (서 < 전) {
//			System.out.println("형준 승");
//		}else {
//			System.out.println("비김");
//		}
//		
//	}
//	
//	int getDice( String name ) {
//		int num = (int)(Math.random()*6)+1;
//		System.out.println(name+ " 주사위 "+num);
//		return num;
//		
//	}
//}