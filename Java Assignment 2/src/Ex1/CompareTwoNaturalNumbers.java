package Ex1;

import java.util.Scanner;

public class CompareTwoNaturalNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập vào hai số tự nhiên
        System.out.print("Nhập vào số tự nhiên thứ nhất: ");
        int a = sc.nextInt();
        System.out.print("Nhập vào số tự nhiên thứ hai: ");
        int b = sc.nextInt();

        // Tính hiệu
        int difference = a - b;

        // So sánh hiệu
        if (difference > 0) {
            System.out.println("Số thứ nhất lớn hơn số thứ hai");
        } else if (difference < 0) {
            System.out.println("Số thứ nhất nhỏ hơn số thứ hai");
        } else {
            System.out.println("Hai số bằng nhau");
        }
    }
}
