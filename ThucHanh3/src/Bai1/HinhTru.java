package Bai1;

public class HinhTru extends  HinhTron {
    private float chieuCao;

    public HinhTru(float banKinh, float chieuCao) {
        super(banKinh);
        this.chieuCao = chieuCao;
    }

    public HinhTru() {
        super();
        this.chieuCao = 5;
    }


    public float getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(float chieuCao) {
        this.chieuCao = chieuCao;
    }

    @Override
    public String toString() {
        return "HinhTru{" +
                "chieuCao=" + chieuCao +
                ", day=" + super.toString() +
                '}';
    }

    public float tinhTheTich() {
        return (float) (Math.PI * Math.pow(banKinh, 2) * chieuCao);
    }
}
