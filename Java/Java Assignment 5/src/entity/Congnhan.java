package entity;

import java.util.Scanner;

public class Congnhan extends Canbo {
	private int capBac;
	
	@Override
	public void themcanbo() {
		super.themcanbo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap cap bac: ");
		capBac = sc.nextInt();
		
	}

	public int getCapBac() {
		return capBac;
	}

	public void setCapBac(int capBac) {
		this.capBac = capBac;
	}

	@Override
	public String toString() {
		return "Cong nhan:" + super.toString()+ " - " + capBac;
	}
	
}