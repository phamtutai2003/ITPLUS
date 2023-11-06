package entity;

import java.util.Scanner;

public class Canbo {
	private String hoTen;
	private int tuoi;
	private gioiTinh gioiTinh;
	private String diaChi;
	
	
	
	public void themcanbo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap ten can bo: ");
		hoTen = sc.nextLine();
		
		System.out.println("Nhap tuoi: ");
		tuoi = sc.nextInt();
		
		System.out.println("Nhap gioi tinh:  (1.Nam, 2.Nu, 3.Khac) ");
		setGioiTinh(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Nhap dia chi: ");
		diaChi = sc.nextLine();
		
	}
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	public gioiTinh getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(int gioiTinh) {
		if(gioiTinh == 1) {
			this.gioiTinh = entity.gioiTinh.NAM;
		}
		else if(gioiTinh == 2) {
			this.gioiTinh = entity.gioiTinh.NU;
		}
		else {
			this.gioiTinh = entity.gioiTinh.KHAC;
		}
			
	}

	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public String toString() {
		return "Canbo [hoTen=" + hoTen + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + "]";
	}
	
	
}