package backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.GiangVien;
import entity.HocVien;
import entity.PhuTrach;



public class ITPLUSbackend {
    // You can define fields or variables specific to ITPLUSbackend here.
	public  static List<HocVien> listHV = new ArrayList<>();
	public  static List<GiangVien> listGV = new ArrayList<>();
	public  static List<PhuTrach> listPT = new ArrayList<>();
   
    // Define methods and functionalities specific to ITPLUSbackend
    

    // You can add more methods and functionalities as needed.

	 public  static void addNew() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Chọn đối tượng:");
	        System.out.println("1. Học viên");
	        System.out.println("2. Giảng viên");
	        System.out.println("3. Phụ trách");

	        int choice = scanner.nextInt();

	        switch (choice) {
	            case 1:
	                addHocVien();
	                break;
	            case 2:
	                addGiangVien();
	                break;
	            case 3:
	                addPhuTrach();
	                break;
	            default:
	                System.out.println("Chọn đối tượng không hợp lệ");
	                break;
	        }
	    }

	 public  static void addPhuTrach() {
		    Scanner scanner = new Scanner(System.in);

		    System.out.println("Nhập thông tin phụ trách:");
		    System.out.println("Họ và tên:");
		    String hoTen = scanner.nextLine();
		    System.out.println("Tuổi:");
		    int tuoi = scanner.nextInt();
		    scanner.nextLine(); // Consume the newline character
		    System.out.println("Quê quán:");
		    String queQuan = scanner.nextLine();

		    PhuTrach phuTrach = new PhuTrach(hoTen, tuoi, queQuan);
		    listPT.add(phuTrach);

		    System.out.println("Thêm phụ trách thành công!");
		}

		// TODO Auto-generated method stub
		

	 public  static void addHocVien() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Nhập thông tin học viên:");
	        System.out.println("Họ và tên:");
	        String hoTen = scanner.nextLine();
	        System.out.println("Tuổi:");
	        int tuoi = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character
	        System.out.println("Quê quán:");
	        String queQuan = scanner.nextLine();

	        HocVien hocVien = new HocVien(hoTen, tuoi, queQuan);
	        listHV.add(hocVien);

	        System.out.println("Thêm học viên thành công!");
	    }

	 public  static void addGiangVien() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Nhập thông tin giảng viên:");
	        System.out.println("Họ và tên:");
	        String hoTen = scanner.nextLine();
	        System.out.println("Tuổi:");
	        int tuoi = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character
	        System.out.println("Quê quán:");
	        String queQuan = scanner.nextLine();

	        GiangVien giangVien = new GiangVien(hoTen, tuoi, queQuan);
	        listGV.add(giangVien);

	        System.out.println("Thêm giảng viên thành công!");
	    }
	 public static void search() {
		    Scanner scanner = new Scanner(System.in);

		    System.out.println("Chọn cách tìm kiếm:");
		    System.out.println("1. Tìm theo tên");
		    System.out.println("2. Tìm theo tuổi");
		    int searchChoice = scanner.nextInt();
		    scanner.nextLine(); // Consume the newline character

		    switch (searchChoice) {
		        case 1:
		            System.out.println("Nhập tên cần tìm:");
		            String searchName = scanner.nextLine();
		            System.out.println("Searching by name: " + searchName);
		            searchByName(searchName);
		            break;
		        case 2:
		            System.out.println("Nhập tuổi cần tìm:");
		            int searchAge = scanner.nextInt();
		            System.out.println("Searching by age: " + searchAge);
		            searchByAge(searchAge);
		            break;
		        default:
		            System.out.println("Lựa chọn không hợp lệ.");
		            break;
		    }
		}
	 public static void searchByName(String name) {
		    // Implement the logic to search for records by name
		}

		public static void searchByAge(int age) {
		    // Implement the logic to search for records by age
		}

	 public  static void displayAll() {
	        System.out.println("Danh sách học viên:");
	        for (HocVien hocVien : listHV) {
	            System.out.println(hocVien);
	        }

	        System.out.println("Danh sách giảng viên:");
	        for (GiangVien giangVien : listGV) {
	            System.out.println(giangVien);
	        }

	        System.out.println("Danh sách phụ trách:");
	        for (PhuTrach phuTrach : listPT) {
	            System.out.println(phuTrach);
	        }
	    }
	 public  static void deleteInfo() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Nhập tên cần xóa:");
	        String nameToDelete = scanner.nextLine();

	        boolean deleted = deleteByName(nameToDelete);
	        if (deleted) {
	            System.out.println("Đã xóa thành công.");
	        } else {
	            System.out.println("Không tìm thấy bản ghi để xóa.");
	        }
	    }

	 public  static boolean deleteByName(String name) {
	        // Implement the logic to delete records by name
	        return false; // Return true if a record was successfully deleted
	    }


}
