package test;

public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1=new int[100];
		int sum=0;	
		for(int i=1;i<=arr1.length;i++) {
		sum+=i;
		
		
		}
		System.out.println("1~100Че"+sum);
		
		double avg=0.0;
		avg=sum/(double)arr1.length;
		System.out.printf("ЦђБе:%.2f",avg);
		
		

		
		
		
	}
	

}
