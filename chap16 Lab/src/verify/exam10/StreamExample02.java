package verify.exam10;

import java.util.Arrays;
import java.util.List;

public class StreamExample02 {

	public static void main(String[] args) {
		// List�� ����Ǿ� �ִ� Member�� ��� ���̸� ����Ϸ��� �մϴ�. 
		//��ĭ�� �˸��� �ڵ带 �ۼ��� ������.
		List<Member> list = Arrays.asList(
				new Member("ȫ�浿", 30),
				new Member("�ſ��", 40),
				new Member("���ڹ�", 26)
				);
				double avg = list.stream()
			
				.mapToInt(Member::getAge)
				.average()
				.getAsDouble();
				System.out.println("��� ����: " + avg);
				}

	static class Member {
		private String name;
		private int age;

		public Member(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}
	}

}
