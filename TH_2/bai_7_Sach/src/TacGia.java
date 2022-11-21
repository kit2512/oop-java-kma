public class TacGia {
    private String maTacGia;
    private String ten;
    private String email;
    private String thongTin;

    public TacGia(String maTacGia, String ten, String email, String thongTin) {
        this.maTacGia = maTacGia;
        this.ten = ten;
        this.email = email;
        this.thongTin = thongTin;
    }

    public String getMaTacGia() {
        return maTacGia;
    }


    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getThongTin() {
        return thongTin;
    }

    public void setThongTin(String thongTin) {
        this.thongTin = thongTin;
    }

    @Override
    public String toString() {
        return "TacGia{" +
                "maTacGia='" + maTacGia + '\'' +
                ", ten='" + ten + '\'' +
                ", email='" + email + '\'' +
                ", thongTin='" + thongTin + '\'' +
                '}';
    }
}
