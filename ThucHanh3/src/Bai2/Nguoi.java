package Bai2;

import java.util.Date;

public class Nguoi {
    protected String maSo;
    protected String ngaySinh;
    protected Date ngaySInh;
    protected String diaChi;

    public Nguoi(String maSo, String ngaySinh, Date ngaySInh, String diaChi) {
        this.maSo = maSo;
        this.ngaySinh = ngaySinh;
        this.ngaySInh = ngaySInh;
        this.diaChi = diaChi;
    }

    public Nguoi() {

    }

    public String getMaSo() {
        return maSo;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Date getNgaySInh() {
        return ngaySInh;
    }

    public void setNgaySInh(Date ngaySInh) {
        this.ngaySInh = ngaySInh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return
                "maSo='" + maSo + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", ngaySInh=" + ngaySInh +
                ", diaChi='" + diaChi + '\'';
    }
}

