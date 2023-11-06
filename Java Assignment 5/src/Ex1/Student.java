package Ex1;

public class Student {
    @SuppressWarnings("unused")
	private int id;
    private String name;
    @SuppressWarnings("unused")
	private String hometown;
    private double diemHocLuc;

    public Student(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
        this.diemHocLuc = 0.0;
    }

    public void setDiemHocLuc(double diemHocLuc) {
        this.diemHocLuc = diemHocLuc;
    }

    public void congThemDiem(double diemThem) {
        this.diemHocLuc += diemThem;
    }

    public void inThongTin() {
        System.out.println("Tên: " + name);
        System.out.print("Điểm học lực: ");
        if (diemHocLuc < 4.0) {
            System.out.println("Yếu");
        } else if (diemHocLuc >= 4.0 && diemHocLuc < 6.0) {
            System.out.println("Trung bình");
        } else if (diemHocLuc >= 6.0 && diemHocLuc < 8.0) {
            System.out.println("Khá");
        } else {
            System.out.println("Giỏi");
        }
    }
}
