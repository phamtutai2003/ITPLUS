package entity;

import java.util.Scanner;

public class Kysu extends Canbo {
	private String nganhDaoTao;
	
	
	@Override
	public void themcanbo() {
		super.themcanbo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap nganh dao tao: ");
		nganhDaoTao = sc.nextLine();
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}

	@Override
	public String toString() {
		return "Cong nhan:" + super.toString()+ " - " + nganhDaoTao;
	}
	
	
}