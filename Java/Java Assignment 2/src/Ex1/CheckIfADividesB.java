package Ex1;

import java.util.Scanner;

public class CheckIfADividesB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập vào 2 số tự nhiên
        System.out.print("Nhập vào số tự nhiên thứ nhất: ");
        int a = sc.nextInt();
        System.out.print("Nhập vào số tự nhiên thứ hai: ");
        int b = sc.nextInt();

        // Kiểm tra xem a có chia hết cho b không
        if (a % b == 0) {
            System.out.println("a chia hết cho b");
        } else {
            System.out.println("a không chia hết cho b");
        }
    }
}