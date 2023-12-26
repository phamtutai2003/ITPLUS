package entity;

public class Student extends Person{
	private String clazz;
	public String skill;
	private float fee;

	public Student(int id, String name) {
		super(id, name);
	}
	
	public void sleep() {
		System.out.println("Student sleep....");
	}
// Lay ra
	public String getClazz() {
		return clazz;
	}
// Truyen vao
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public float getFee() {
		return fee;
	}

	public void setFee(float fee) {
		if (fee <= 2000) {
			System.out.println("It hon 2000");
		}
		else {
			this.fee = fee;
		}
	}
	
	
	
}