package ch12.sec03.exam02;

public class Student {
	private int no;
	private String name;

	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getNo() {
		return no;
	}

	@Override
	public int hashCode() {
		int hashCode = no + name.hashCode();
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student target = (Student) obj;
			// no와 name의 값이 같은지 비교
			if (no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;

	}
}
