package verify;

	import java.util.StringTokenizer;
	
	public class SpiltExample {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String str = "아이디,이름,패스워드";
			StringTokenizer st=new StringTokenizer(str,",");
			int countTokens=st.countTokens();
			for(int i=0;i<countTokens;i++){
			String token=st.nextToken();
			System.out.println(token);
			}
			System.out.println();
		// #2: StringTokenizer 이용
		 st=new StringTokenizer(str,",");
		 while(st.hasMoreTokens()) {
			 String token=st.nextToken();
					 System.out.println(token);
		 }
		}
		}

