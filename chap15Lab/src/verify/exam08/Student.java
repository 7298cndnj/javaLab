package verify.exam08;

public class Student {
	public int studentNum;
	public String name;

	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		// #2 ?ۼ? ??ġ
		if(obj instanceof Student) {
			Student student=(Student)obj;
			if(student.hashCode()==this.hashCode())
				return true;
		}
		return false;
	}
}
