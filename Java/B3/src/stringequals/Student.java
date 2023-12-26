package stringequals;

public class Student {
 
	int id;
	String firtName;
	String lastName;
	
	@Override
	public boolean equals (Object obj) {
		if (obj == null) {
			return false;
		}
		
		Student student2 = (Student) obj;
		String fullName = student2.firtName + " " + student2.lastName;
		
		if (fullName.equals(firtName + " " + lastName)) {
			return true;
		}
		return false;
	}
}
