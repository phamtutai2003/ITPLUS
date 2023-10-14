package BT;
// chuyển đổi đơn vị
import java.util.Scanner;

public class Bt1 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.print("Nhập số centimet ( hoặc nhập 0 để thoát ): ");
	            double centimeters = scanner.nextDouble();

	            if (centimeters == 0) {
	                System.out.println("Chương trình kết thúc.");
	                break; // Thoát khỏi vòng lặp nếu người dùng nhập 0
	            }

	            double feet = centimeters / 30.48; // Chuyển đổi centimet thành feet
	            double inches = centimeters / 2.54; // Chuyển đổi centimet thành inches
	            System.out.println("");
	            System.out.println("Số tương đương bằng feet: " + feet +"(feet)");
	           
	            System.out.println("Số tương đương bằng inches: " + inches + "(inch)");
	        }

	        scanner.close();
	    }
}
