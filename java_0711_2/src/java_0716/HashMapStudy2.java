package java_0716;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapStudy2 {

	public static void main(String[] args) {
		
		HashMap<String, ImageBoard> board = new HashMap<>();
		
		ImageBoard temp = new ImageBoard("자바설치","javava","설치.jpg");
		board.put(temp.getTitle(), temp);
		temp = new ImageBoard("mysql설치방법","설치인생","mysql설치.jpg");
		board.put(temp.getTitle(), temp);
		temp = new ImageBoard("DBeaver설치방법","설치했음","DBeaver설치.jpg");
		board.put(temp.getTitle(), temp);
		temp = new ImageBoard("윈도우설치마스터","기본에충실","윈도우설치.jpg");
		board.put(temp.getTitle(), temp);
		temp = new ImageBoard("MacOS공부","사과농장","MacOS응용.jpg");
		board.put(temp.getTitle(), temp);
		
		System.out.println( board.get("자바설치"));
		
		Scanner sc = new Scanner(System.in);
		// 이미지 게시판의 글 제목 출력하고 
		// 보고싶은 글의 제목을 입력하면 
		// 해당 글의 내용을 볼 수 있다.
		
		Set<String> titles = board.keySet();
		System.out.println("=== 이미지게시판 목록 ===");
		titles.forEach( title -> System.out.println(title));
		
		System.out.println("글 제목 입력 : ");
		String inputTitle = sc.nextLine();
		
		System.out.println( board.get(inputTitle));
		
	}

}
