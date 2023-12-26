import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import entity.Book;

public class Program_c2 {

    public static void main(String[] args) {
        List<Book> books = readBooksFromFile("src/book.txt");

        System.out.println("Tổng số sách: " + books.size());
        System.out.println("Thông tin sách:");
        for (Book book : books) {
            System.out.println(book);
        }

        sortBooksByName(books);
        System.out.println("\nDanh sách sau khi sắp xếp theo tên sách:");
        for (Book book : books) {
            System.out.println(book);
        }
        
        // Print the first book to verify data reading
        if (!books.isEmpty()) {
            System.out.println("\nDữ liệu đầu tiên sau khi đọc từ file:");
            System.out.println(books.get(0));
        }
    }

    private static List<Book> readBooksFromFile(String fileName) {
        List<Book> books = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    String publishing = parts[2].trim();
                    Book book = new Book(id, name, publishing);
                    books.add(book);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return books;
    }

    private static void sortBooksByName(List<Book> books) {
        Collections.sort(books, Comparator.comparing(Book::getName));
    }
}
