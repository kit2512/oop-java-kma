package Bai5;

import Bai4.Diem;

public class KiemTra {
    public static void main(String[] args) {
        DiemDiChuyen diemDiChuyen = new DiemDiChuyen(1,1,5,5);
        HinhTronDiChuyen hinhTronDiChuyen = new HinhTronDiChuyen(10,diemDiChuyen);
        hinhTronDiChuyen.diLen(2);
        System.out.println(hinhTronDiChuyen);
    }
}
