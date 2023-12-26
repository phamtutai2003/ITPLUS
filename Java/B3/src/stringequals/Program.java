package stringequals;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Student student1 = new Student();
		student1.id = 1;
		student1.firtName = "Nguyen";
		student1.lastName = "Nam";
		
		Student student2 = new Student();
		student2.id = 2;
		student2.firtName = "Nguyen";
		student2.lastName = "Nam";
		
		System.out.println(student1.equals(student2));
	
	}

}
