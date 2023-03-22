/*
 Дочерний класс Ellipse

 Драгун Д.С.
 */
public class Ellipse implements Figure {
    private  double a =0;
    private double b = 0;

    //переменные a, b  - полуоси эллипса
    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }
    //формула площади
    @Override
    public double getSquare(){
        return Math.PI * a * b;
    }
    //формула периметра
    @Override
    public double getPerimetr(){
        return 4 * ((Math.PI *a*b + (a-b))/(a+b));
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;

    }
}

