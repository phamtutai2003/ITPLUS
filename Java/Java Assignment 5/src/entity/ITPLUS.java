package entity;

import java.util.Scanner;

public class ITPLUS {
    private String ten;
    private int tuoi;
    private String quequan;
    
   
    	public void themmoi() {
    	    Scanner sc = new Scanner(System.in);

    	    System.out.println("Thêm mới:");
    	    System.out.println("1. Học viên");
    	    System.out.println("2. Giảng viên");
    	    System.out.println("3. Phụ trách");

    	    int luachon = sc.nextInt();
    	    sc.nextLine(); // Consume the newline character

    	   
			switch (luachon) {
    	        case 1:
    	            // Thêm mới Học viên
    	            System.out.println("Nhap ten Học viên: ");
    	            String hoTenHocVien = sc.nextLine();

    	            System.out.println("Nhap tuoi: ");
    	            int tuoiHocVien = sc.nextInt();
    	            sc.nextLine(); // Consume the newline character

    	           

    	            System.out.println("Nhap dia chi: ");
    	            String diaChiHocVien = sc.nextLine();

    	            // Tạo đối tượng Học viên và thêm vào danh sách Học viên
    	            HocVien hocVien = new HocVien(hoTenHocVien, tuoiHocVien,  diaChiHocVien);
    	            

    	            System.out.println("Thêm Học viên thành công!");
    	            break;
    	        case 2:
    	            // Thêm mới Giảng viên
    	            System.out.println("Nhap ten Giảng viên: ");
    	            String hoTenGiangVien = sc.nextLine();

    	            System.out.println("Nhap tuoi: ");
    	            int tuoiGiangVien = sc.nextInt();
    	            sc.nextLine(); // Consume the newline character

    	         

    	            System.out.println("Nhap dia chi: ");
    	            String diaChiGiangVien = sc.nextLine();

    	            // Tạo đối tượng Giảng viên và thêm vào danh sách Giảng viên
    	            GiangVien giangVien = new GiangVien(hoTenGiangVien, tuoiGiangVien,  diaChiGiangVien);
    	            
    	            System.out.println("Thêm Giảng viên thành công!");
    	            break;
    	        case 3:
    	            // Thêm mới Phụ trách
    	            System.out.println("Nhap ten Phụ trách: ");
    	            String hoTenPhuTrach = sc.nextLine();

    	            System.out.println("Nhap tuoi: ");
    	            int tuoiPhuTrach = sc.nextInt();
    	            sc.nextLine(); // Consume the newline character

    	           // Consume the newline character

    	            System.out.println("Nhap dia chi: ");
    	            String diaChiPhuTrach = sc.nextLine();

    	            // Tạo đối tượng Phụ trách và thêm vào danh sách Phụ trách
    	            PhuTrach phuTrach = new PhuTrach(hoTenPhuTrach, tuoiPhuTrach,  diaChiPhuTrach);
    	           

    	            System.out.println("Thêm Phụ trách thành công!");
    	            break;
    	        default:
    	            System.out.println("Lựa chọn không hợp lệ");
    	            break;
    	    }
    	}

 

    public ITPLUS(String ten, int tuoi, String quequan) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.quequan = quequan;
    }

    // Getters and setters (if needed)

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    @Override
    public String toString() {
        return "Tên: " + ten + "\nTuổi: " + tuoi + "\nQuê quán: " + quequan;
    }
}
