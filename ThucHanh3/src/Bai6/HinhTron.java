package Bai6;

public class HinhTron implements DoiTuongHinhHoc{
    protected float r;

    public HinhTron(float r) {
        this.r = r;
    }

    @Override
    public double tinhChuVi() {
        return Math.PI * r * 2;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * r * r;
    }
}
