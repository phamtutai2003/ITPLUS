package Ex1;

import java.util.Scanner;

public class FindMaxMinOf4Integers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập vào 4 số nguyên
        System.out.print("Nhập vào số nguyên thứ nhất: ");
        int a = sc.nextInt();
        System.out.print("Nhập vào số nguyên thứ hai: ");
        int b = sc.nextInt();
        System.out.print("Nhập vào số nguyên thứ ba: ");
        int c = sc.nextInt();
        System.out.print("Nhập vào số nguyên thứ tư: ");
        int d = sc.nextInt();

        // Xác định số lớn nhất
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }

        // Xác định số nhỏ nhất
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (d < min) {
            min = d;
        }

        // In ra kết quả
        System.out.println("Số lớn nhất là: " + max);
        System.out.println("Số nhỏ nhất là: " + min);
    }
}