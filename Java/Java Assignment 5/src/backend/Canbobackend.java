package backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Canbo;
import entity.Congnhan;
import entity.Kysu;
import entity.Nhanvien;

public class Canbobackend {
		List<Canbo> listcanbo = new ArrayList<Canbo>();
		Scanner sc = new Scanner(System.in);
	
	public void Themcanbo() {
		Canbo doituong = new Canbo();            // Class cha
		System.out.println("Chon loai can bo");
		System.out.println("1. Cong nhan");
		System.out.println("2. Ky su");
		System.out.println("3. Nhanvien");
		
		int nhap = sc.nextInt();
		// Array List
		switch (nhap) {
		case 1:
			doituong = new Congnhan();             //2 Class con
			break;
		case 2:
			doituong = new Kysu();
			break;
		case 3:
			doituong = new Nhanvien();
			break;
		}
		
		doituong.themcanbo();                     //3
		listcanbo.add(doituong);
		
		for (Canbo i : listcanbo) {
			System.out.println(i);
		}
	}
	
	public void Xoacanbo() {
	    System.out.println("Nhập tên cán bộ cần xóa: ");
	    String tenCanBoXoa = sc.next();
	    
	    for (Canbo i : listcanbo) {
	        if (i.getHoTen().equals(tenCanBoXoa)) {
	            listcanbo.remove(i);
	            System.out.println("Đã xóa cán bộ " + tenCanBoXoa);
	            return;
	        }
	    }
	    
	    System.out.println("Không tìm thấy cán bộ có tên " + tenCanBoXoa);
	}
	
	public void Hienthicanbo() {
	    System.out.println("Danh sách cán bộ:");
	    for (Canbo i : listcanbo) {
	        System.out.println(i);
	        System.out.println(); // Dòng trống
	    }
	}


	
	public void Timkiemcanbo() {
	    System.out.println("Nhập tên cán bộ cần tìm: ");
	    String tenCanBoTimKiem = sc.next();
	    
	    boolean timThay = false;
	    
	    for (Canbo i : listcanbo) {
	        if (i.getHoTen().equals(tenCanBoTimKiem)) {
	            System.out.println("Tìm thấy cán bộ:");
	            System.out.println(i);
	            timThay = true;
	        }
	    }
	    
	    if (!timThay) {
	        System.out.println("Không tìm thấy cán bộ có tên " + tenCanBoTimKiem);
	    }
	}


}