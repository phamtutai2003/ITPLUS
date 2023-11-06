package frontend;

import java.util.Scanner;
import backend.ITPLUSbackend;

public class ProgramITPLUS {
    public static void main(String[] args) {
        ITPLUSbackend itplusBackend = new ITPLUSbackend(); // Create an instance of the backend

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("------------------------|");
            System.out.println("|1. Thêm mới            |");
            System.out.println("|2. Tìm kiếm            |");
            System.out.println("|3. Hiển thị danh sách  |");
            System.out.println("|4. Xóa                 |");
            System.out.println("|5. Thoát               |");
            System.out.println("|-----------------------");

            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập lựa chọn: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    itplusBackend.addNew();
                    break;
                case 2:
                    itplusBackend.search();
                    break;
                case 3:
                    itplusBackend.displayAll();
                    break;
                case 4:
                    itplusBackend.deleteInfo();
                    break;
                case 5:
                    isRunning = false;
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Hãy chọn một tùy chọn hợp lệ.");
                    break;
            }
        }
    }
}
