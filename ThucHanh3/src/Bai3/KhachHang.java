package Bai3;

public class KhachHang {
    protected String maKH;
    protected String hoTen;
    protected String diaChi;
    protected int tienTra;

    public KhachHang(String maKH, String hoTen, String diaChi, int tienTra) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.tienTra = tienTra;
    }

    public KhachHang() {
    }

    public String getMaKH() {
        return maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getTienTra() {
        return tienTra;
    }

    public void setTienTra(int tienTra) {
        this.tienTra = tienTra;
    }

    @Override
    public String toString() {
        return
                "maKH='" + maKH + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", tienTra=" + tienTra;
    }
}
