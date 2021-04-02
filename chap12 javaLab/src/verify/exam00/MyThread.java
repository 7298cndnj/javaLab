package verify.exam00;

<<<<<<< HEAD

//Thread 클래스를 상속한 하위클래스로 생성
//작성위치
public class MyThread {

=======
public class MyThread extends Thread {
	//Thread 클래스를 상속한 하위 클래스로 생성
	@Override
	public void run() {
		for(int i=0;i<500;i++) {
			System.out.print("T");
		}
	}
>>>>>>> refs/remotes/origin/master
}
