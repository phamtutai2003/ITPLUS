import java.io.Serializable;

public class Student implements Serializable {
	private int id;
	private String name;
	private String quequan;
	public Student(int id, String name, String quequan) {
		this.id = id;
		this.name = name;
		this.quequan = quequan;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuequan() {
		return quequan;
	}
	public void setQuequan(String quequan) {
		this.quequan = quequan;
	}	
}