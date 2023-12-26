import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ProgramObject {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student student1 = new Student(1,"Minh","Ha Noi");
		Student student2 = new Student(2,"Quang","Sai Gon");
		Student student3 = new Student(3,"Tuan","Da Nang");
		
		final String duongdan = "D:\\ITPLUS\\student.ser";
	//Ghi file
		FileOutputStream ghifile = new FileOutputStream(duongdan);
		ObjectOutputStream objectoutput = new ObjectOutputStream(ghifile);
		objectoutput.writeObject(student1);
		System.out.println("Da ghi thanh cong");
		objectoutput.close();
	//Doc file
		FileInputStream docfile = new FileInputStream(duongdan);
		ObjectInputStream objectinput = new ObjectInputStream(docfile);
		Object obj = objectinput.readObject();
		Student std = (Student) obj;	
		System.out.println(std.getName());
		System.out.println(std.getId());
	}
}