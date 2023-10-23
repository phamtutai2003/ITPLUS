package frontend;
import entity.Acount;
import entity.Department;
import entity.IT1;
import entity.IT2;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Acount acount1 = new Acount(1, "Tai");
          Department department = new Department(3, "Tai","tai@gmail.com","T2");
          System.out.println(department.clazz);
          
          IT1 student1 = new IT1();
          student1.lambaitap();
          
          student1.lamduan();
          
          IT2 student2 = new IT2();
          student2.game();
	}

}
