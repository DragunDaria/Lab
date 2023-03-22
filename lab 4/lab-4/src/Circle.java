/*
 Дочерний класс Circle

 Драгун Д.С.
 */
public class Circle implements Figure {
    private double radius = 0;
    //Переменная radius - радиус круга
    public Circle(double radius) {
        this.radius = radius;
    }
    //формула пложади круга
    @Override
    public double getSquare(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //формула длины окружности
    @Override
    public double getPerimetr() {
        return 2 * Math.PI * radius;
    }
}
