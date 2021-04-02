package verify.exam00;

public class MyRunMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRun mr1 = new MyRun();   
		Thread t1 = new Thread(mr1);   
		Thread t2 = new MyThread();   
<<<<<<< HEAD
		t1.start();  
		t2.start();   
		for (int i = 0; i < 500; i++) {   
			System.out.print("M");   
			} 
		} 
	
}
}

}
=======
		t1.start();   
		t2.start();   
		for (int i = 0; i < 500; i++) {    
		System.out.print("M");   
		}  
		} 
	}

>>>>>>> refs/remotes/origin/master
