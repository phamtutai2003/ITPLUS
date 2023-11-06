package Ex1;

import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {
        // Nhập xâu ký tự
        System.out.print("Nhập xâu ký tự: ");
        String input = new Scanner(System.in).nextLine();

        // Khởi tạo biến đếm
        int count = 0;

        // Duyệt qua từng ký tự của xâu ký tự
        for (int i = 0; i < input.length(); i++) {
            // Nếu ký tự hiện tại là ký tự khoảng trắng
            if (input.charAt(i) == ' ') {
                // Tăng biến đếm
                count++;
            }
        }

        // In ra số lượng từ
        System.out.println("Số lượng từ trong xâu ký tự là: " + count);
    }
}