package BT;
//Nhập vào 4 số hiển thị số lớn nhất và nhỏ nhất

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        double num1 = scanner.nextDouble();

        System.out.print("Nhập số thứ hai: ");
        double num2 = scanner.nextDouble();

        System.out.print("Nhập số thứ ba: ");
        double num3 = scanner.nextDouble();

        System.out.print("Nhập số thứ tư: ");
        double num4 = scanner.nextDouble();

       
        double max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num4 > max) {
            max = num4;
        }

       
        double min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        if (num4 < min) {
            min = num4;
        }

        System.out.println("Số lớn nhất là: " + max);
        System.out.println("Số nhỏ nhất là: " + min);

        scanner.close();
    }
}

