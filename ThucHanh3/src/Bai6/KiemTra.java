package Bai6;

public class KiemTra {
    public static void main(String[] args) {
        HinhTron hinhTron = new HinhTron(5);
        HinhTronThayDoi hinhTronThayDoi = new HinhTronThayDoi(5);
        hinhTronThayDoi.thayDoiKichThuoc(50);
        System.out.println(hinhTronThayDoi.tinhChuVi());
        System.out.println(hinhTronThayDoi.tinhDienTich());
    }
}
