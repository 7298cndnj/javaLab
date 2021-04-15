package verify.exam10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample04 {

	public static void main(String[] args) {
		/*List�� ����Ǿ� �ִ� Member�� �������� �׷����ؼ� Map<String,List<String>> ��ü�� �����Ϸ��� �մϴ�.
		Ű�� Member�� �����̰�, ���� Member�� �̸����� ������ List<String>�Դϴ�. 
		 * ��ĭ�� �˸��� �ڵ带 �ۼ��غ�����.
		 */
		List<Member> list = Arrays.asList(
				new Member("ȫ�浿", "������"),
				new Member("�質��", "�����̳�"),
				new Member("�ſ��", "������")
				);
				Map<String, List<String>> groupingMap =list.stream()
						.collect(Collectors.groupingBy(Member::getJob,Collectors.mapping(Member::getName, Collectors.toList())));
				
				System.out.print("[������] ");
				groupingMap.get("������").stream().forEach(s -> System.out.print(s + " "));
				System.out.print("\n[�����̳�] ");
				groupingMap.get("�����̳�").stream().forEach(s -> System.out.print(s + " "));
	}

	static class Member {
		private String name;
		private String job;

		public Member(String name, String job) {
			this.name = name;
			this.job = job;
		}

		public String getName() {
			return name;
		}

		public String getJob() {
			return job;
		}
	}

}