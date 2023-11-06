package Ex4;

import java.util.Scanner;

public class InputThreeIntegers {

    public static void main(String[] args) {
        // Khai báo đối tượng Scanner
        Scanner sc = new Scanner(System.in);

        // Nhập số nguyên thứ nhất
        System.out.print("Nhập số nguyên thứ nhất: ");
        int a = sc.nextInt();

        // Nhập số nguyên thứ hai
        System.out.print("Nhập số nguyên thứ hai: ");
        int b = sc.nextInt();

        // Nhập số nguyên thứ ba
        System.out.print("Nhập số nguyên thứ ba: ");
        int c = sc.nextInt();

        // Xử lý dữ liệu
        // ...

        // Đóng đối tượng Scanner
        sc.close();
    }
}