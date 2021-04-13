package verify.exam10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample03 {

	public static void main(String[] args) {
		//List�� ����Ǿ� �ִ� Member �߿��� ������ "������"�� ����� ������ List�� �����Ϸ��� �մϴ�.
		//��ĭ�� �˸��� �ڵ带 �ۼ��� ������.
		List<Member> list = Arrays.asList(
				new Member("ȫ�浿", "������"),
				new Member("�質��", "�����̳�"),
				new Member("�ſ��", "������")
				);
		List<Member> developers = list.stream()
				.filter(m->m.getJob()=="������")
				.collect(Collectors.toList());
				developers.stream().forEach(m -> System.out.println(m.getName()));
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

// ���� ���
// ȫ�浿
// �ſ��
}


