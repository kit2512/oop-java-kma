public class Sach {
    private String maSach;
    private String tenSach;
    private TacGia tacGia;
    private int gia;
    private int soTrang;

    public Sach(String maSach, String tenSach, TacGia tacGia, int gia, int soTrang) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.gia = gia;
        this.soTrang = soTrang;
    }

    public String getMaSach() {
        return maSach;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public TacGia getTacGia() {
        return tacGia;
    }

    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "maSach='" + maSach + '\'' +
                ", tenSach='" + tenSach + '\'' +
                ", tacGia=" + tacGia +
                ", gia=" + gia +
                ", soTrang=" + soTrang +
                '}';
    }


}
