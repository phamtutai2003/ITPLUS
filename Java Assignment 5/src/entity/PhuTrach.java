package entity;

public class PhuTrach {
    private String hoTenPhuTrach;
    private int tuoiPhuTrach;
    private String diaChiPhuTrach;

    public PhuTrach(String hoTenPhuTrach, int tuoiPhuTrach, String diaChiPhuTrach) {
        this.hoTenPhuTrach = hoTenPhuTrach;
        this.tuoiPhuTrach = tuoiPhuTrach;
        this.diaChiPhuTrach = diaChiPhuTrach;
    }

    // Getters and setters for instance variables
    public String getHoTenPhuTrach() {
        return hoTenPhuTrach;
    }

    public void setHoTenPhuTrach(String hoTenPhuTrach) {
        this.hoTenPhuTrach = hoTenPhuTrach;
    }

    public int getTuoiPhuTrach() {
        return tuoiPhuTrach;
    }

    public void setTuoiPhuTrach(int tuoiPhuTrach) {
        this.tuoiPhuTrach = tuoiPhuTrach;
    }

    public String getDiaChiPhuTrach() {
        return diaChiPhuTrach;
    }

    public void setDiaChiPhuTrach(String diaChiPhuTrach) {
        this.diaChiPhuTrach = diaChiPhuTrach;
    }
    @Override
    public String toString() {
        return "PhuTrach [hoTenPhuTrach=" + hoTenPhuTrach + ", tuoiPhuTrach=" + tuoiPhuTrach + ", diaChiPhuTrach=" + diaChiPhuTrach + "]";
    }

    // You can add more methods and functionality specific to PhuTrach here.
}
