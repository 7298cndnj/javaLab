package test;

import java.util.Scanner;

public class ExitGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		Scanner sc3=new Scanner(System.in);
		Scanner sc4=new Scanner(System.in);
		System.out.println("�Է�:");
		int a=sc.nextInt();
		sum+=a;
		System.out.println("��:"+sum);
		if(sum>=100) {
			sc.close();
		}else {
		System.out.println("�Է�:");
		int b=sc1.nextInt();
		sum+=a+b;
		System.out.println("��:"+sum);
		if(sum>=100) {
			sc.close();
		}else {
		System.out.println("�Է�:");
		int c=sc2.nextInt();
		sum=sum+c;
		System.out.println("��:"+sum);
		if(sum>=100) {
			sc.close();
		}else {
		System.out.println("�Է�:");
		int d=sc3.nextInt();
		sum=sum+d;
		System.out.println("��:"+sum);
		if(sum>=100) {
			sc.close();
		}else {
		System.out.println("�Է�:");
		int e=sc4.nextInt();
		sum=sum+e;
		System.out.println("��:"+sum);
		}
	sc.close();
		}
		}
		//test
		}
	}
}