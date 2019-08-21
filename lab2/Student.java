package lab2;

public class Student {
	private long id;
	private String name;
	private float cgpa;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCgpa() {
		return cgpa;
	}

	@Override
	public String toString() {
		return "Student Information: "+ "\n" +"\n" + "id=" + id +"\n"+ "name=" + name +"\n"+ "cgpa=" + cgpa + "\n" + "\n";
	}

	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}

}
