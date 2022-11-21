public class TaiKhoan {
    final String soTaiKhoan;
    private String hoten;
    private int soTien;

    public TaiKhoan(String soTaiKhoan, String hoten, int soTien) {
        this.soTaiKhoan = soTaiKhoan;
        this.hoten = hoten;
        this.soTien = soTien;
    }

    String getSoTaiKhoan() {
        return soTaiKhoan;
    }


    public int getSoTien() {
        return soTien;
    }

    public void setSoTien(int soTien) {
        this.soTien = soTien;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void napTien(int soTien) {
        this.soTien += soTien;
    }

    public void rutTien(int soTien) {
        if (this.soTien <= 0) {
            System.out.println("Khong du so du");
        }
        else {
            this.soTien -= soTien;
        }
    }

    public void chuyenTien(String stk, int soTien) {
        if (this.soTien <= 0) {
            System.out.println("Khong du so du");
        }
        else {

            // chuyen den stk
            this.soTien -= soTien;

        }
    }
}
