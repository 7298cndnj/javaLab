package verify.exam08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import sec04.exam01_hashmap.Student;

public class HashsetExanmple {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		set.add(new Student(1, "ȫ�浿"));
		set.add(new Student(2, "�ſ��"));
		set.add(new Student(1, "���ο�"));
		Iterator<Student> iterator = set.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum+ ":" + student.name);
		}
	}

}