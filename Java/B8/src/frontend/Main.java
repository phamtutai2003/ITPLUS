package frontend;

public class Main {
    // Phương thức in ra thông tin của tham số bất kỳ
    public static <T> void print(T a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        // Tạo một đối tượng sinh viên
        SinhVien sinhVien = new SinhVien(1, "SinhVien1");

        // Gọi phương thức print với các tham số khác nhau
        print("Họ và tên: John Doe");
        print(sinhVien);
        print(4);
        print(4.0);
    }

    static class SinhVien {
        private int id;
        private String ten;

        public SinhVien(int id, String ten) {
            this.id = id;
            this.ten = ten;
        }

        @Override
        public String toString() {
            return "SinhVien{id=" + id + ", ten='" + ten + "'}";
        }
    }
}

