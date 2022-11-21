package Bai2;

import java.util.Date;

public class GiaoVien extends Nguoi {
    private String boMon;
    private String khoa;
    private String hocHam;
    private String hocVi;
    private  int luong;

    public GiaoVien(String maSo, String ngaySinh, Date ngaySInh, String diaChi, String boMon, String khoa, String hocHam, String hocVi, int luong) {
        super(maSo, ngaySinh, ngaySInh, diaChi);
        this.boMon = boMon;
        this.khoa = khoa;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.luong = luong;
    }

    public GiaoVien(String boMon, String khoa, String hocHam, String hocVi, int luong) {
        this.boMon = boMon;
        this.khoa = khoa;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.luong = luong;
    }

    public GiaoVien() {
        super();
    }

    public String getBoMon() {
        return boMon;
    }

    public void setBoMon(String boMon) {
        this.boMon = boMon;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getHocHam() {
        return hocHam;
    }

    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    public String getHocVi() {
        return hocVi;
    }

    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "GiaoVien{" +
                super.toString() + "'" +
                "boMon='" + boMon + '\'' +
                ", khoa='" + khoa + '\'' +
                ", hocHam='" + hocHam + '\'' +
                ", hocVi='" + hocVi + '\'' +
                ", luong=" + luong +
                '}';
    }
}
