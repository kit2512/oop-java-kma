package Bai5;

public class DiemDiChuyen implements GiaoDienDiChuyen{
    private float x;
    private float y;
    private float vX;
    private float vY;

    public DiemDiChuyen(float x, float y, float vX, float vY) {
        this.x = x;
        this.y = y;
        this.vX = vX;
        this.vY = vY;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
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
                "x=" + x +
                ", y=" + y +
                ", vX=" + vX +
                ", vY=" + vY +
                '}';
    }

    @Override
    public void diLen(int thoiGian) {
        y += thoiGian * vY;
    }

    @Override
    public void diXuong(int thoiGian) {
        y -= thoiGian * vY;
    }

    @Override
    public void sangTrai(int thoiGian) {
        x -= thoiGian * vX;
    }

    @Override
    public void sangPhai(int thoiGian) {
        x += thoiGian * vX;
    }
}
