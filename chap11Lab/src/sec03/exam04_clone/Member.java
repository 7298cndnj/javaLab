package sec03.exam04_clone;

public class Member {
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public Member(String id, String name, String password, int age, boolean adult) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}

public Member getMember() {
	Member clone=null;
	try {
		clone=(Member)clone();
	}catch(CloneNotSuppoertedException e) {
		
	  

	}
	return clone;
}
}
