package Bai4;

public class DiemDiChuyen extends Diem {
    private float vX;
    private float vY;

    public DiemDiChuyen(float x, float y, float vX, float vY) {
        super(x, y);
        this.vX = vX;
        this.vY = vY;
    }

    public DiemDiChuyen() {
        super();
    }

    public float getvX() {
        return vX;
    }

    public void setvX(float vX) {
        this.vX = vX;
    }

    public float getvY() {
        return vY;
    }

    public void setvY(float vY) {
        this.vY = vY;
    }

    @Override
    public String toString() {
        return "DiemDiChuyen{" +
                super.toString() +
                ", vX=" + vX +
                ", vY=" + vY +
                '}';
    }

    public void diChuyen(float durationInSeconds) {
        /// I don't know how to implement this method
    }
}
