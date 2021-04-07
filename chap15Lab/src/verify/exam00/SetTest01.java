package verify.exam00;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class SetTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s=new HashSet();
		int n;
		//TreeSet s=new TreeSet();
		Random r=new Random();
		while(s.size()!=6) {
//			n=(int)(Math.random()*45+1);
//			s.add(n);
//			s.add(r.nextInt(45)+1);
			n=r.nextInt(45)+1;
			s.add(n);
		}
		//set->list 변경하여 Collections.sort()를 이용하여 정렬한다.
		List list=new ArrayList(s);
		Collections.sort(list);
		
		System.out.println(s);
		System.out.println(list);
	}
}
