package verify;

public class Member {
	//�ʵ�
	private String id;
	private String name;
	//������
	public Member(String id, String name) {
	this.id = id;
	this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+":"+name;
	}

	}

