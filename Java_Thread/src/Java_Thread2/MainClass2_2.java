package Java_Thread2;

public class MainClass2_2 {

	public static void main(String[] args) throws InterruptedException {
		
		NormalTh th = new NormalTh("일반");
		th.start();
		
//		DaemonTh dm = new DaemonTh();
//		dm.setDaemon(true);
//		
//		dm.start();

		Thread.sleep(6000);
		
		System.out.println("main 종료");
	}

}
