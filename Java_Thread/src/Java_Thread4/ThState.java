package Java_Thread4;

public enum ThState {
	New, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED 
	
//	int num;
//	ThState(int num){
//		this.num = num;
//	}
//	int getNum() {
//		return this.num;
//	}
}

/*
	상수들의 클래스처럼 사용할 수 있는 방법 - Enum
	
	final int num = 20;
	num = 30; 오류
	
	const num = 10;
	num = 30; 오류
	
	menu <- 1. 파일 열기, 2. 파일 저장, 3. 다른 이름저장, 4. 환경설정, 5. 종료
	
	enum Menu{
		OPEN, SAVE, SAVEAS, SET, EXIT
		}
	
	int menu = scan.nextInt();
	
	switch( menu ){
	case Menu.파일열기:
	case Menu.파일저장:
	case Menu.다른이름저장:
	case Menu.환경설정:
	case Menu.종료:
	
 */