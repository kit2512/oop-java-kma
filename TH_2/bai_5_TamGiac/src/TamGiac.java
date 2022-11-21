public class TamGiac {
    private Diem point1;
    private Diem point2;
    private Diem point3;

    public TamGiac(Diem point1, Diem point2, Diem point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public TamGiac(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.point1 = new Diem(x1, y1);
        this.point2 = new Diem(x2, y2);
        this.point3 = new Diem(x3, y3);
    }

    boolean isTamGiac() {
        return (point1.getX() - point2.getX()) * (point1.getY() - point3.getY()) != (point1.getX() - point3.getX()) * (point1.getY() - point2.getY());
    }

    double getChuVi() {
        return point1.khoangCach(point2) + point2.khoangCach(point3) + point3.khoangCach(point1);
    }

    double getDienTich() {
        double p = getChuVi() / 2;
        return Math.sqrt(p * (p - point1.khoangCach(point2)) * (p - point2.khoangCach(point3)) * (p - point3.khoangCach(point1)));
    }
}
