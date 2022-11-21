public class HoaDoan {
    final private String maHoaDon;
    private KhachHang khachHang;
    private int tienTra;

    public HoaDoan(String maHoaDon, KhachHang khachHang, int tienTra) {
        this.maHoaDon = maHoaDon;
        this.khachHang = khachHang;
        this.tienTra = tienTra;
    }

    String getMaHoaDon() {
        return maHoaDon;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }


    public void setTienTra(int tienTra) {
        this.tienTra = tienTra;
    }

    public int getTienTra() {
        return tienTra * (getKhachHang().getGiamGia() / 100);
    
}
