public class TaiKhoan {
    final private String soTaiKhoan;
    private KhachHang khachHang;
    private int soTien;

    public TaiKhoan(String soTaiKhoan, KhachHang khachHang, int soTien) {
        this.soTaiKhoan = soTaiKhoan;
        this.khachHang = khachHang;
        this.soTien = soTien;
    }


    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public int getSoTien() {
        return soTien;
    }

    public void napTien(int soTien) {
        this.soTien += soTien;
    }

    public void rutTien(int soTien) {
        if (this.soTien >= soTien) {
            this.soTien -= soTien;
        } else {
            System.out.println("Unable to withdraw money");
        }
    }
}