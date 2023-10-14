import java.util.Scanner;
public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		System.out.println(a);
		
		Scanner nhap = new Scanner (System.in);
		System.out.println("Nhap vao 1 so: ");
		int so = nhap.nextInt();
		System.out.println(so);
		
		System.out.println("Nhap vao mot so thap phan: ");
		float sothapphan = nhap.nextFloat();
		System.out.println(sothapphan);
		
		System.out.println("Nhap vao mot chuoi: ");
		String chuoi = nhap.next();
		System.out.println(chuoi);
		
	
		
	}

}
