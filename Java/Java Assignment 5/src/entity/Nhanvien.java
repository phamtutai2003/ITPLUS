package entity;

import java.util.Scanner;

public class Nhanvien extends Canbo {
	private String congViec;
	
	@Override
	public void themcanbo() {
		super.themcanbo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap cong viec: ");
		congViec = sc.nextLine();
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

	@Override
	public String toString() {
		return "Cong nhan:" + super.toString()+ " - " + congViec;
	}
	
	
}