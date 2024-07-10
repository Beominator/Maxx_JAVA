package java_0709;

public class ObjectArray2 {

	public static void main(String[] args) {
	
		Game[] play = new Game[7];
		
		play[0] = new Game("오버워치", "FPS", "PC");
		play[1] = new Game("스타크래프트", "전략시뮬레이션", "PC");
		play[2] = new Game("로스트아크", "롤플레잉", "PC");
		play[3] = new Game("리그오브레전드", "AOS", "PC");
		play[4] = new Game("엘든링", "롤플레잉", "PS5");
		play[5] = new Game("다크소울", "롤플레잉", "PC, Switch");
		play[6] = new Game("철권7", "격투", "PC, PS4");
		
		
		for( Game game : play) {
			System.out.println( game );
		}

	}

}
// 7개의 게임 정보를 가진 객체를 생성하고 출력하세요.