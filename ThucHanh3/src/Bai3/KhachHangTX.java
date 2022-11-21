package Bai3;

public class KhachHangTX extends KhachHang {
    private int giamGia;

    public KhachHangTX(String maKH, String hoTen, String diaChi, int tienTra, int giamGia) {
        super(maKH, hoTen, diaChi, tienTra);
        this.giamGia = giamGia;
    }

    public int getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(int giamGia) {
        this.giamGia = giamGia;
    }

    public int tinhTien() {
        return super.tienTra * giamGia;
    }

    @Override
    public String toString() {
        return "KhachHangTX{" +
                super.toString() +
                "giamGia=" + giamGia +
                '}';
    }
}
