package Ex2;

import java.util.ArrayList;
import java.util.List;

public class CanBo {
  
	private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;

    public CanBo(String hoTen, int tuoi, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

	public int getTuoi() {
		// TODO Auto-generated method stub
		return tuoi;
	}

	public String getGioiTinh() {
		// TODO Auto-generated method stub
		return gioiTinh;
	}

	public String getDiaChi() {
		// TODO Auto-generated method stub
		return diaChi;
	}
}

class CongNhan extends CanBo {
    private int bac;

    public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int bac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }
}

class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }
}

class NhanVien extends CanBo {
    private String congViec;

    public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }
}

class QLCB {
    private List<CanBo> danhSachCanBo;

    public QLCB() {
        danhSachCanBo = new ArrayList<>();
    }

    public void themCanBo(CanBo canBo) {
        danhSachCanBo.add(canBo);
    }

    public CanBo timKiemTheoHoTen(String hoTen) {
        for (CanBo canBo : danhSachCanBo) {
            if (canBo.getHoTen().equalsIgnoreCase(hoTen)) {
                return canBo;
            }
        }
        return null;
    }
}
