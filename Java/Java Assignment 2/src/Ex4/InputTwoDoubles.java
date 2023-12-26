package Ex4;

import java.util.Scanner;

public class InputTwoDoubles {

    public static void main(String[] args) {
        // Khai báo đối tượng Scanner
        Scanner sc = new Scanner(System.in);

        // Nhập số thực thứ nhất
        System.out.print("Nhập số thực thứ nhất: ");
        double a = sc.nextDouble();

        // Nhập số thực thứ hai
        System.out.print("Nhập số thực thứ hai: ");
        double b = sc.nextDouble();

        // Xử lý dữ liệu
        // ...

        // Đóng đối tượng Scanner
        sc.close();
    }
}