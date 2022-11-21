public class NhanVien {
    final String maNhanVien;
    private String hoTen;
    private int luong;

    public NhanVien(String maNhanVien, String hoTen, int luong) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }


    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public void xuatThongTin() {
        System.out.println("Ma nhan vien: " + maNhanVien);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Luong: " + luong);
    }

    int luongTheoNam() {
        return this.luong * 12;
    }

    void tangLuong(float phanTram) {
        this.luong += this.luong * phanTram;
    }
}
