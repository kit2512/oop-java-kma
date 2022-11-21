package Bai5;

public class HinhTronDiChuyen implements GiaoDienDiChuyen{
    private float r;
    private DiemDiChuyen tam;

    public HinhTronDiChuyen(float r, DiemDiChuyen tam) {
        this.r = r;
        this.tam = tam;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public DiemDiChuyen getTam() {
        return tam;
    }

    public void setTam(DiemDiChuyen tam) {
        this.tam = tam;
    }


    @Override
    public void diLen(int thoiGian) {
        tam.diLen(thoiGian);
    }

    @Override
    public void diXuong(int thoiGian) {
        tam.diXuong(thoiGian);
    }

    @Override
    public void sangTrai(int thoiGian) {
        tam.sangTrai(thoiGian);
    }

    @Override
    public void sangPhai(int thoiGian) {
        tam.sangTrai(thoiGian);
    }

    @Override
    public String toString() {
        return "HinhTronDiChuyen{" +
                "r=" + r +
                ", tam=" + tam +
                '}';
    }
}
