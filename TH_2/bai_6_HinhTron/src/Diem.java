public class Diem {
    private int x;
    private int y;

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Diem() {
        this(0, 0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double khoangCach(Diem other) {
        int dx = this.x - other.x;
        int dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
