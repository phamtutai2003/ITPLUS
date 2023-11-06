package entity;

public class HocVien {
    private String hoTenHocVien;
    private int tuoiHocVien;
    private String diaChiHocVien;

    public HocVien(String hoTenHocVien, int tuoiHocVien, String diaChiHocVien) {
        this.hoTenHocVien = hoTenHocVien;
        this.tuoiHocVien = tuoiHocVien;
        this.diaChiHocVien = diaChiHocVien;
    }

    // Getters and setters for instance variables
    public String getHoTenHocVien() {
        return hoTenHocVien;
    }

    public void setHoTenHocVien(String hoTenHocVien) {
        this.hoTenHocVien = hoTenHocVien;
    }

    public int getTuoiHocVien() {
        return tuoiHocVien;
    }

    public void setTuoiHocVien(int tuoiHocVien) {
        this.tuoiHocVien = tuoiHocVien;
    }

    public String getDiaChiHocVien() {
        return diaChiHocVien;
    }

    public void setDiaChiHocVien(String diaChiHocVien) {
        this.diaChiHocVien = diaChiHocVien;
    }
    public String toString() {
        return "HocVien [hoTenHocVien=" + hoTenHocVien + ", tuoiHocVien=" + tuoiHocVien + ", diaChiHocVien=" + diaChiHocVien + "]";
    }
    // You can add more methods and functionality specific to HocVien here.
}
