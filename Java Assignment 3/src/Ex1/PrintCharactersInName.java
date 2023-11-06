package Ex1;

import java.util.Scanner;

public class PrintCharactersInName {

    public static void main(String[] args) {
        // Nhập tên
        System.out.print("Nhập tên của bạn: ");
        String name = new Scanner(System.in).nextLine();

        // Duyệt qua từng ký tự trong tên
        for (int i = 0; i < name.length(); i++) {
            // In ra ký tự thứ i
            System.out.println("Ký tự thứ " + (i + 1) + " là: " + name.charAt(i));
        }
    }
}
