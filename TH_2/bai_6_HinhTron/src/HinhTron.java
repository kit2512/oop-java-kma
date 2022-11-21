public class HinhTron {
    private Diem tam;
    private double banKinh;

    public HinhTron(Diem tam, double banKinh) {
        this.tam = tam;
        this.banKinh = banKinh;
    }

    public Diem tam() {
        return tam;
    }

    public double banKinh() {
        return banKinh;
    }

    public double chuVi() {
        return 2 * Math.PI * banKinh;
    }

    public double dienTich() {
        return Math.PI * banKinh * banKinh;
    }

    public double khoangCach(HinhTron other) {
        return tam.khoangCach(other.tam);
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "tam=" + tam +
                ", banKinh=" + banKinh +
                '}';
    }
}
