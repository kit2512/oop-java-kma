package Bai4;

public class Diem {
    protected float x;
    protected float y;

    public Diem(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Diem() {
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

    @Override
    public String toString() {
        return
                "x=" + x +
                ", y=" + y;
    }
}

