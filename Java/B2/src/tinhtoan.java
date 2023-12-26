
public class tinhtoan {

	public static void main(String[] args) {
		
   // Khai báo biến
		int so1;
		int so2;
		so1 = 6;
		so2 = 6;
		float thuong;
		int tong , tich, sodu;
		tong = so1 + so2;
		tich = so1*so2;
		thuong =  (float )so1/so2;
		sodu = so1  % so2;
	   System.out.println("Tổng của 2 số là = " + tong);
	   System.out.println("Thương của 2 số là = " + sodu);
	   if(so1 > so2 ) {
		   System.out.println("So1 lớn hơn So2");
	   }else if(so1 == so2) {
		   System.out.println("So1 bằng So2");
	   }
	   else {
		   System.out.println("So1 nhỏ hơn so2");
	   }
	   
	   
	   
	   
	   int so5;
	   so5 = 6;
	  
	     if (so1 > so2 && so1 > so5) {
	            System.out.println("So1 là lớn nhất");
	        } else if (so2 > so1 && so2 > so5) {
	        	
	           System.out.println("So2 là lớn nhất");
	        } else if(so1==so2 && so1==so5) {
	        	System.out.println("Không có giá trị lớn nhất");
	        }
	        else {
	            System.out.println("so5 là lớn nhất");
	        }

	        
	   
	   
	   int a = 5, b = 10;
	   a = a+ 1;
	   b +=1;
//	   System.out.println(b);
//	   Kiểm tra tính chẵn lẻ
	   int so4=5;
	   if (so4% 2 == 0) {
		   System.out.println("Số chẵn");
	   }else{
		   System.out.println("Số lẻ");
	   }
	   
	}

}
