package Ex1;

import java.util.Scanner;

public class ConvertCentimeterToFootInch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào số centimet: ");
        double centimeter = sc.nextDouble();

        // Chuyển cm sang inch
        double inch = centimeter / 2.54;

        // Chuyển cm sang foot
        double foot = inch / 12;

        // In ra kết quả
        System.out.printf("Số tương đương tính bằng foot: %.2f feet\n", foot);
        System.out.printf("Số tương đương tính bằng inch: %.2f inch\n", inch);
    }
}