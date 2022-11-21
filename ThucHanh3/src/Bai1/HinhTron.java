package Bai1;

public class HinhTron {
    public HinhTron(float banKinh) {
        this.banKinh = banKinh;
    }

    public HinhTron() {
        this.banKinh = 5;
    }

    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }

    protected float banKinh;

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh +
                '}';
    }
}
