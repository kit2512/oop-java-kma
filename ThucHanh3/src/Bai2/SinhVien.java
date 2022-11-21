package Bai2;

import java.util.Date;

public class SinhVien extends Nguoi {
    public String nganh;
    public String khoa;
    public int namNhapHoc;
    public int namTotNghiep;

    public SinhVien(String maSo, String ngaySinh, Date ngaySInh, String diaChi, String nganh, String khoa, int namNhapHoc, int namTotNghiep) {
        super(maSo, ngaySinh, ngaySInh, diaChi);
        this.nganh = nganh;
        this.khoa = khoa;
        this.namNhapHoc = namNhapHoc;
        this.namTotNghiep = namTotNghiep;
    }

    public SinhVien() {
        super();
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public int getNamNhapHoc() {
        return namNhapHoc;
    }

    public void setNamNhapHoc(int namNhapHoc) {
        this.namNhapHoc = namNhapHoc;
    }

    public int getNamTotNghiep() {
        return namTotNghiep;
    }

    public void setNamTotNghiep(int namTotNghiep) {
        this.namTotNghiep = namTotNghiep;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                super.toString() + "'" +
                "nganh='" + nganh + '\'' +
                ", khoa='" + khoa + '\'' +
                ", namNhapHoc=" + namNhapHoc +
                ", namTotNghiep=" + namTotNghiep;

    }
}
