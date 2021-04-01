package verify.exam00;

public class MyRun implements Runnable {
	//Runnable 인터페이스를 구현 클래스로 생성 
	@Override
	public void run() {
		for(int i=0;i<500;i++) {
			System.out.print("S");
		}
	}
	
}
