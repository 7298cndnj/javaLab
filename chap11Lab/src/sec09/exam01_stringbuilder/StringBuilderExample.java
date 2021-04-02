package sec09.exam01_stringbuilder;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		
		sb.append("Java");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4,"2");
		System.out.println(sb.toString());
	
	
	
	}

}
//String str = "";
//for(int i=1; i<=100; i++) {
//str += i;
//}
//System.out.println(str);
//
//
//StringBuilder str2= new StringBuilder();
//for (int i = 1; i <= 100; i++)
//str2.append(i);
//System.out.println(str2.toString());
//}
//}

