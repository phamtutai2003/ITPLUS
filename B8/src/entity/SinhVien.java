package entity;

public class SinhVien {
    private Object id;
    private String ten;

    public SinhVien(Object id, String ten) {
        this.id = id;
        this.ten = ten;
    }

    public Object getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public static void main(String[] args) {
        // a) Tạo đối tượng Sinh viên có id là int
        SinhVien sinhVienInt = new SinhVien(1, "SinhVien1");

        // b) Tạo đối tượng Sinh viên có id là float
        SinhVien sinhVienFloat = new SinhVien(2.5f, "SinhVien2");

        // c) Tạo đối tượng Sinh viên có id là gấp đôi
        SinhVien sinhVienGopDoi = new SinhVien(10L, "SinhVien3");

        // In thông tin của các đối tượng Sinh viên
        System.out.println("Sinh viên có id là int: " + sinhVienInt.getId() + ", " + sinhVienInt.getTen());
        System.out.println("Sinh viên có id là float: " + sinhVienFloat.getId() + ", " + sinhVienFloat.getTen());
        System.out.println("Sinh viên có id là gấp đôi: " + sinhVienGopDoi.getId() + ", " + sinhVienGopDoi.getTen());
    }
}
