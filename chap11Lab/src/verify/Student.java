package verify;

import java.util.Objects;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
	this.studentNum = studentNum;
	}
	public String getStudent() {
	return studentNum;
	
	}
	@Override
	public int hashCode() {
		return Objects.hash(studentNum);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student compareStudent=(Student)obj;
			if(this.studentNum==compareStudent.studentNum) {
				return true;
			}
		
	}
			return false;
	}
}
