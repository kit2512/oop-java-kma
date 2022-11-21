public class KhachHang {
    final private String maKhachHang;
    private String hoTen;
    private int giamGia;

    // create parameterized constructor
    public KhachHang(String maKhachHang, String hoTen, int giamGia) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.giamGia = giamGia;
    }

    String getMaKhachHang() {
        return maKhachHang;
    }


    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(int giamGia) {
        this.giamGia = giamGia;
    }


}

