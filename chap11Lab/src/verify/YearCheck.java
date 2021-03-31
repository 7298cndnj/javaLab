package verify;


import java.util.GregorianCalendar;
import java.util.Scanner;

public class YearCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("연도를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
	
		int year = sc.nextInt();
		
//		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//		System.out.println(year + "은 윤년");
//		} else {
//		System.out.println(year + "은 평년");
//		}
		//작성위치:Gregorian Calendar의 메소드를 이용하여 윤년인지를 파악한다.
		GregorianCalendar year1=new GregorianCalendar();
		if(year1.isLeapYear(year)) {
			System.out.println(year+"은 윤년");
			
		}else {
			System.out.println(year+"은 평년");
		}
	
	} 	
		
}

	
