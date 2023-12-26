package entity;

public class GiangVien {
    private String hoTenGiangVien;
    private int tuoiGiangVien;
    private String diaChiGiangVien;

    public GiangVien(String hoTenGiangVien, int tuoiGiangVien, String diaChiGiangVien) {
        this.hoTenGiangVien = hoTenGiangVien;
        this.tuoiGiangVien = tuoiGiangVien;
        this.diaChiGiangVien = diaChiGiangVien;
    }

    // Getters and setters for instance variables
    public String getHoTenGiangVien() {
        return hoTenGiangVien;
    }

    public void setHoTenGiangVien(String hoTenGiangVien) {
        this.hoTenGiangVien = hoTenGiangVien;
    }

    public int getTuoiGiangVien() {
        return tuoiGiangVien;
    }

    public void setTuoiGiangVien(int tuoiGiangVien) {
        this.tuoiGiangVien = tuoiGiangVien;
    }

    public String getDiaChiGiangVien() {
        return diaChiGiangVien;
    }

    public void setDiaChiGiangVien(String diaChiGiangVien) {
        this.diaChiGiangVien = diaChiGiangVien;
    }
    @Override
    public String toString() {
        return "GiangVien [hoTenGiangVien=" + hoTenGiangVien + ", tuoiGiangVien=" + tuoiGiangVien + ", diaChiGiangVien=" + diaChiGiangVien + "]";
    }

    // You can add more methods and functionality specific to GiangVien here.
}
