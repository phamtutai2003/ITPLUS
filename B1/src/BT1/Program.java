package BT1;

public class Program {

	public static void main(String[] args) {
		ChucVu cv1 = new ChucVu();
		cv1.machucvu = 1;
		cv1.chucvu = "Truong Phong";
		
		
		
		PhongBan pb1 = new PhongBan();
		pb1.maphong = 1;
		pb1.tenphong = "PhongBan1";
		
		// TODO Auto-generated method stub
 NhanVien nv1 = new NhanVien();
 nv1.id = 1;
 nv1.name = "Tai";
 nv1.age = 20;
 nv1.chucvu = cv1;
 nv1.phongban = pb1;

 
 NhanVien nv2 = new NhanVien();
 nv2.id= 2;
 nv2.name ="Truong";
 nv2.age = 35;
 nv2.chucvu = cv1;
 nv2.phongban = pb1;

 System.out.println(nv1.phongban.tenphong );
 System.out.println(nv1.chucvu.chucvu);
		 
	}

}
