package entity;

public class Person {
	public int id;
	public String name;
	public String country;
	
	public Person(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public void sleep() {
		System.out.println("Person sleep");
	}
}