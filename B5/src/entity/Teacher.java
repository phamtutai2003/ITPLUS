package entity;

public class Teacher extends Person {

	public Teacher(int id, String name) {
		super(id, name);
	}
	
	public void sleep() {
		System.out.println("Teacher sleep...");
	}

}