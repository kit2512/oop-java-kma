package Bai6;

public class HinhTronThayDoi extends HinhTron implements ThayDoiKichThuoc {
    public HinhTronThayDoi(float r) {
        super(r);
    }

    @Override
    public void thayDoiKichThuoc(int phanTram) {
        r = r * phanTram / 100;
    }
}
