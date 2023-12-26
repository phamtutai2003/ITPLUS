package Ex4;

import java.util.Scanner;

public class InputFullName {

    public static void main(String[] args) {
        // Khai báo đối tượng Scanner
        Scanner sc = new Scanner(System.in);

        // Nhập họ
        System.out.print("Nhập họ: ");
        String ho = sc.nextLine();

        // Nhập tên
        System.out.print("Nhập tên: ");
        String ten = sc.nextLine();

        // Xử lý dữ liệu
        // ...

        // Đóng đối tượng Scanner
        sc.close();
    }
}