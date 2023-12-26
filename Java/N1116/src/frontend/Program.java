package frontend;

import backend.BookBackend;
import entity.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(); // Create a list to store books
        BookBackend bookBackend = new BookBackend(books);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Chương trình quản lý sách");
            System.out.println("1. Thêm sách");
            System.out.println("2. Sửa sách");
            System.out.println("3. Xóa sách");
            System.out.println("4. Tìm kiếm sách");
            System.out.println("5. Thoát");

            System.out.print("Nhập lựa chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    bookBackend.add();
                    break;
                case 2:
                    bookBackend.edit();
                    break;
                case 3:
                    bookBackend.remove();
                    break;
                case 4:
                    System.out.print("Nhập tên sách cần tìm: ");
                    String searchName = scanner.nextLine();
                    bookBackend.searchByName(searchName);
                    break;
                case 5:
                    System.out.println("Đã thoát chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
