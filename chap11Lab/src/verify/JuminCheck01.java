package verify;

import java.util.Scanner;
import java.io.InputStream;

public class JuminCheck01 {
	// �ֹι�ȣ Ÿ�缺 �˻��ϴ� �޼ҵ�
	public boolean juminCheck(String jumin) {
		jumin="7810101234567";
		//1.�ֹι�ȣ �� �ڸ��� �ش� ���ڸ� ���Ѵ�
		int[] mul= {2,3,4,5,6,7,8,9,2,3,4,5};
		int total=0;
		int total2;
		for(int i=0;i<12;i++) {
			total+=Integer.parseInt(jumin.substring(i,i+1))*mul[i];
		//	System.out.println(jumin.substring(i,i+1));
			//System.out.println(mul[i]);
		}System.out.println(total);
		
		//2.1���� �������� 11�� ����� �������� ���Ѵ�.
		total%=11;//total=total%11
		//3.11���� ������ ���� ���� "üũ�� ��ȣ��"���ؼ� ������ �ùٸ� �ֹι�ȣ,�׷��� ������ Ʋ�� �ֹι�ȣ
		total2=11-total;
		if(total2>=10) {
			total2%=10;//total2=total2%10;
		}
		//4.total2�� �ֹε�Ϲ�ȣ ������ ��ȣ�� ������ ���Ѵ�.
		if(total2!=Integer.parseInt(jumin.substring(12,13))) {
			return false;
		}else {
		return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JuminCheck01 jc = new JuminCheck01();
		 InputStream is = System.in;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ֹι�ȣ ���ڸ��� �Է� �ϼ���?");
		String jumin1 = sc.next(); // 111111
		
		System.out.println("�ֹι�ȣ ���ڸ��� �Է� �ϼ���?");
		String jumin2 = sc.next(); // 1111011
		
		if (jumin1.length() != 6) {
			System.out.println("�ֹι�ȣ ���ڸ��� 6�ڸ� �Է�");
		} else if (jumin2.length() != 7) {
			System.out.println("�ֹι�ȣ ���ڸ��� 7�ڸ� �Է�");
		} else if (!jc.juminCheck(jumin1 + jumin2)) {
			System.out.println("�߸��� �ֹι�ȣ �Դϴ�.");
		} else {
			System.out.println("�ùٸ� �ֹι�ȣ �Դϴ�");
		}
	}

}