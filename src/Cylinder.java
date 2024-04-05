public class Cylinder extends Circle {
    private double chieuCao = 0.5;

    public Cylinder() {
    }

    public Cylinder(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public Cylinder(double banKinh, String color, double chieuCao) {
        super(banKinh, color);
        this.chieuCao = chieuCao;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }
    public double getTheTich() {
        return Math.PI*getBanKinh()*getBanKinh()*chieuCao;
    }

    @Override
    public String toString() {
        return "Hinh tru co chieu cao la " + chieuCao +"m, duoc ke thua tu lop " + super.toString();
    }
}
