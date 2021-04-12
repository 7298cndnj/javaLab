package sec05.stream_mapping;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class MapExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("ȫ�浿", 10),
				new Student("�ſ��", 20),
				new Student("���̼�", 30)
		);
			
		studentList.stream()
		//�͸�����ü
		/*.mapToInt(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student s) {
				// TODO Auto-generated method stub
				return s.getScore();
			}
		})*/
		//���ٽ�
//			.mapToInt(s->s.getScore())
		//�Ű����� �޼ҵ� ����
			.mapToInt(Student :: getScore)
			.forEach(score -> System.out.println(score));
	}
}
