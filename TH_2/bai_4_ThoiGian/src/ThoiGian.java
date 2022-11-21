public class ThoiGian {
    private int gio;
    private int phut;
    private int giay;

    public ThoiGian() {
        gio = 0;
        phut = 0;
        giay = 0;
    }

    public ThoiGian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }


    public int getGio() {
        return gio;
    }

    public void setGio(int gio) {
        this.gio = gio;
    }

    public int getPhut() {
        return phut;
    }

    public void setPhut(int phut) {
        this.phut = phut;
    }

    public int getGiay() {
        return giay;
    }

    public void setGiay(int giay) {
        this.giay = giay;
    }

    public void tangMotGiay() {
        giay++;
        if (giay == 60) {
            giay = 0;
            phut++;
            if (phut == 60) {
                phut = 0;
                gio++;
                if (gio == 24) {
                    gio = 0;
                }
            }
        }
    }

    public void giamMotGiay() {
        giay--;
        if (giay == -1) {
            giay = 59;
            phut--;
            if (phut == -1) {
                phut = 59;
                gio--;
                if (gio == -1) {
                    gio = 23;
                }
            }
        }
    }

}
