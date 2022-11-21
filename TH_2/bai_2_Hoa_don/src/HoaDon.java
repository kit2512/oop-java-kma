public class HoaDon {
    final String maHoaDon;
    private String moTa;
    private int soLuong;
    private double donGia;

    public HoaDon(String maHoaDon, String moTa, int soLuong, double donGia) {
        this.maHoaDon = maHoaDon;
        this.moTa = moTa;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getThanhTien() {
        return soLuong * donGia;
    }
}
