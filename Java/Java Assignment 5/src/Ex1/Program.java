package Ex1;
import java.util.Scanner;

import Ex1.Student;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student student1 = new Student("John", "Hanoi");
	        student1.setDiemHocLuc(7.5);
	        student1.inThongTin();

	        Student student2 = new Student("Alice", "Ho Chi Minh City");
	        student2.congThemDiem(2.5);
	        student2.inThongTin();
	        
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập tên của sinh viên: ");
	        String tenSinhVien = scanner.nextLine();

	        System.out.print("Nhập quê quán của sinh viên: ");
	        String queQuanSinhVien = scanner.nextLine();

	        Student student = new Student(tenSinhVien, queQuanSinhVien);

	        System.out.print("Nhập điểm học lực: ");
	        double diemHocLuc = scanner.nextDouble();
	        student.setDiemHocLuc(diemHocLuc);

	        student.inThongTin();
	    }
	}


