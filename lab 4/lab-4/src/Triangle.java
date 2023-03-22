/*
 Дочерний класс Triangle

 Драгун Д.С.
 */
public class Triangle implements Figure {
    private double b1 = 0;
    private double b2 = 0;
    private double b3 = 0;

    // переменные  b1,  b2, b3 - длинны сторон треугольника
    public Triangle(double b1, double b2, double b3) {
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
    }
    //формула площади треугольника
    @Override
    public double getSquare(){
        return Math.sqrt(((b1 + b2 + b3) / 2) * (((b1 + b2 + b3) / 2) - b1) * (((b1 + b2 + b3) / 2) - b2) * (((b1 + b2 + b3) / 2) - b3));
    }
    //формула периметра треугольника
    @Override
    public double getPerimetr(){
        return b1 + b2 + b3;
    }

    public double getB1() {
        return b1;
    }

    public void setB1(double b1) {
        this.b1 = b1;
    }

    public double getB2() {
        return b2;
    }

    public void setB2(double b2) {
        this.b2 = b2;
    }

    public double getB3() {
        return b3;
    }

    public void setB3(double b3) {
        this.b3 = b3;
    }
}
