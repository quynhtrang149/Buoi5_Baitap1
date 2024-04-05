public class Circle {
    private double banKinh = 0.7;
    private String color = "pink";

    public Circle() {
    }

    public Circle(double banKinh, String color) {
        this.banKinh = banKinh;
        this.color = color;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return banKinh*banKinh*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle co ban kinh la "+ banKinh+ "m va mau " + color;
    }
}
