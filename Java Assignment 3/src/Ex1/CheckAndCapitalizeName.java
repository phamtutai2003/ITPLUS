package Ex1;

import java.util.Scanner;

public class CheckAndCapitalizeName {

    public static void main(String[] args) {
        // Nhập tên
        System.out.print("Nhập tên của bạn: ");
        String name = new Scanner(System.in).nextLine();

        // Kiểm tra tên đã viết hoa chữ cái đầu chưa
        if (!Character.isUpperCase(name.charAt(0))) {
            // Viết hoa chữ cái đầu
            name = name.substring(0, 1).toUpperCase() + name.substring(1);
        }

        // In ra tên đã được viết hoa chữ cái đầu
        System.out.println("Tên của bạn là: " + name);
    }
}
