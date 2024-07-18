package java_0712_2;

import java.util.ArrayList;
import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		int[] 일등 = new int[] {8,12,23,29,35,41};
		
		ArrayList<Lotto> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("자동 몇장? : ");
		int howMany = scan.nextInt();
		
		for(int i=1; i<howMany; i++) {
			int[]temp = new int[6];
			for(int k=0; k<temp.length; k++) {
				temp[k] = (int)(Math.random()*45)+1;
				for(int j=0; j<k; j++){
					if(temp[k] == temp[j]) {
						k--; break;
					}
				}
			}
			list.add( new Lotto(temp));
		}
		
		list.forEach(lt -> System.out.println(lt));
	}

}
