package test;

import java.util.Scanner;

public class SignPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			if(num>0) {
				System.out.println("���");
			}else if(num<0){
				System.out.println("����");
			}else{
				num=0;
			System.out.println("0");
			}
	}


}
