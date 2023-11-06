package Ex2;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        QLCB quanLyCB = new QLCB();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn tác vụ:");
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Xóa cán bộ theo tên");
            System.out.println("4. Thoát");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng trống sau khi đọc số

            switch (choice) {
                case 1:
                    themMoiCanBo(quanLyCB, scanner);
                    break;
                case 2:
                    timKiemTheoHoTen(quanLyCB, scanner);
                    break;
                    
                case 3:
                    xoaCanBoTheoTen(quanLyCB, scanner);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
    private static void xoaCanBoTheoTen(QLCB quanLyCB, Scanner scanner) {
        System.out.print("Nhập tên cán bộ cần xóa: ");
        String hoTen = scanner.nextLine();
        
        CanBo canBoXoa = quanLyCB.timKiemTheoHoTen(hoTen);
        if (canBoXoa != null) {
            quanLyCB.themCanBo(canBoXoa);
            System.out.println("Cán bộ có tên " + hoTen + " đã bị xóa.");
        } else {
            System.out.println("Không tìm thấy cán bộ có tên: " + hoTen);
        }
    }
	private static void themMoiCanBo(QLCB quanLyCB, Scanner scanner) {
        System.out.print("Nhập họ tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        String gioiTinh = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String diaChi = scanner.nextLine();

        System.out.println("Chọn loại cán bộ:");
        System.out.println("1. Công nhân");
        System.out.println("2. Kỹ sư");
        System.out.println("3. Nhân viên");
        int loaiCanBo = scanner.nextInt();
        scanner.nextLine();

        CanBo canBo = null;

        switch (loaiCanBo) {
            case 1:
                System.out.print("Nhập bậc: ");
                int bac = scanner.nextInt();
                canBo = new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
                break;
            case 2:
                System.out.print("Nhập ngành đào tạo: ");
                String nganhDaoTao = scanner.nextLine();
                canBo = new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao);
                break;
            case 3:
                System.out.print("Nhập công việc: ");
                String congViec = scanner.nextLine();
                canBo = new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }

        if (canBo != null) {
            quanLyCB.themCanBo(canBo);
            System.out.println("Thêm mới cán bộ thành công.");

            // Hiển thị toàn bộ thông tin của cán bộ
            System.out.println("Thông tin cán bộ:");
            System.out.println("Họ tên: " + canBo.getHoTen());
            System.out.println("Tuổi: " + tuoi);
            System.out.println("Giới tính: " + gioiTinh);
            System.out.println("Địa chỉ: " + diaChi);
            if (canBo instanceof CongNhan) {
                System.out.println("Loại cán bộ: Công nhân");
                System.out.println("Bậc: " + ((CongNhan) canBo).getBac());
            } else if (canBo instanceof KySu) {
                System.out.println("Loại cán bộ: Kỹ sư");
                System.out.println("Ngành đào tạo: " + ((KySu) canBo).getNganhDaoTao());
            } else if (canBo instanceof NhanVien) {
                System.out.println("Loại cán bộ: Nhân viên");
                System.out.println("Công việc: " + ((NhanVien) canBo).getCongViec());
            }
        }
    }

    private static void timKiemTheoHoTen(QLCB quanLyCB, Scanner scanner) {
        System.out.print("Nhập họ tên cán bộ cần tìm: ");
        String hoTen = scanner.nextLine();

        CanBo canBoTimThay = quanLyCB.timKiemTheoHoTen(hoTen);

        if (canBoTimThay != null) {
            System.out.println("Thông tin cán bộ tìm thấy:");
            System.out.println("Họ tên: " + canBoTimThay.getHoTen());
            System.out.println("Tuổi: " + canBoTimThay.getTuoi());
            System.out.println("Giới tính: " + canBoTimThay.getGioiTinh());
            System.out.println("Địa chỉ: " + canBoTimThay.getDiaChi());

            if (canBoTimThay instanceof CongNhan) {
                System.out.println("Loại cán bộ: Công nhân");
                System.out.println("Bậc: " + ((CongNhan) canBoTimThay).getBac());
            } else if (canBoTimThay instanceof KySu) {
                System.out.println("Loại cán bộ: Kỹ sư");
                System.out.println("Ngành đào tạo: " + ((KySu) canBoTimThay).getNganhDaoTao());
            } else if (canBoTimThay instanceof NhanVien) {
                System.out.println("Loại cán bộ: Nhân viên");
                System.out.println("Công việc: " + ((NhanVien) canBoTimThay).getCongViec());
            }
        } else {
            System.out.println("Không tìm thấy cán bộ có họ tên: " + hoTen);
        }
    }

}
