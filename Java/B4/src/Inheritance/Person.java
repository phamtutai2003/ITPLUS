package Inheritance;

public class Person {
	public String name;
	public int CCD;
	public String email;
	public String adress;
	
	public Person(String name, int CCD) {
		this.name = name;
		this.CCD = CCD;
		
	}
	
	

	public void eat() {
		System.out.println("Ăn");
	}
	public void slepp() {
		System.out.println("Ngủ");
	}
}
