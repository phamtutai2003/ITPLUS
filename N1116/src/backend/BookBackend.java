package backend;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import backend.*;

import entity.Book;

public class BookBackend implements Input, Activity, Search {

    private List<Book> books;

    public BookBackend(List<Book> books) {
        this.books = books;
      
    }

    public boolean saveToFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Book book : books) {
                writer.write(book.getId() + ";" + book.getName() + ";" + book.getPublishing());
                writer.newLine();
            }
            System.out.println("Dữ liệu đã được lưu vào file " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
		return false;
    }

 

	@Override
    public void menu() {
        while (true) {
            System.out.println("Chương trình quản lý sách");
            System.out.println("1. Thêm sách");
            System.out.println("2. Sửa sách");
            System.out.println("3. Xóa sách");
            System.out.println("4. Tìm kiếm sách");
            System.out.println("5. Thoát");

            System.out.print("Nhập lựa chọn: ");
            int choice = inputScannerInt();

            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    remove();
                    break;
                case 4:
                    System.out.print("Nhập tên sách cần tìm: ");
                    String searchName = inputScannerString();
                    searchByName(searchName);
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

    public int inputScannerInt() {
        // Implement the inputScannerInt method here
        // You may use the scanner from the Input interface or create a new one
        // Example:
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số nguyên. Hãy thử lại.");
            }
        }
    }
    public String inputScannerString() {
        // Implement the inputScannerString method here
        // You may use the scanner from the Input interface or create a new one
        // Example:
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

	@Override
    public void add() {
        System.out.println("Nhập thông tin sách: ");
        System.out.print("Mã sách: ");
        int id = inputScannerInt();
        System.out.print("Tên sách: ");
        String name = inputScannerString();
        System.out.print("Nhà xuất bản: ");
        String publishing = inputScannerString();
        Book book = new Book(id, name, publishing);
        books.add(book);
        System.out.println("Thêm thành công!");
    }

    @Override
    public void edit() {
        System.out.println("Nhập mã sách cần sửa: ");
        int id = inputScannerInt();
        Book book = findBookById(id);

        if (book != null) {
            System.out.print("Tên sách mới: ");
            String name = inputScannerString();
            System.out.print("Nhà xuất bản mới: ");
            String publishing = inputScannerString();
            book.setName(name);
            book.setPublishing(publishing);
            System.out.println("Sửa thành công!");
        } else {
            System.out.println("Không trùng mã!");
        }
    }

    @Override
    public void remove() {
        System.out.println("Nhập mã sách cần xóa: ");
        int id = inputScannerInt();
        Book book = findBookById(id);

        if (book != null) {
            books.remove(book);
            System.out.println("Xóa thành công!");
        } else {
            System.out.println("Không trùng mã!");
        }
    }

    @Override
    public void searchByName(String name) {
        List<Book> result = findBooksByName(name);

        if (!result.isEmpty()) {
            System.out.println("Thông tin sách có tên như từ khoá tìm kiếm:");
            for (Book book : result) {
                System.out.println("Mã sách: " + book.getId() + ", Tên sách: " + book.getName() + ", Nhà xuất bản: " + book.getPublishing());
            }
        } else {
            System.out.println("Không tìm thấy sách.");
        }
    }

    private Book findBookById(int id) {
        return books.stream().filter(b -> b.getId() == id).findFirst().orElse(null);
    }

    private List<Book> findBooksByName(String name) {
        return books.stream().filter(b -> b.getName().contains(name)).toList();
    }
    
}
