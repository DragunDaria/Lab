public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.print("Площадь круга = ");
        System.out.println(circle.getSquare());
        System.out.print("Длина окружности = ");
        System.out.println(circle.getPerimetr());

        Rectanqle rectanqle = new Rectanqle(15, 7);
        System.out.print("Площадь прямоугольника = ");
        System.out.println(rectanqle.getSquare());
        System.out.print("Периметр прямоугольника  = ");
        System.out.println(rectanqle.getPerimetr());

        Triangle triangle = new Triangle(15, 7, 9);
        System.out.print("Площадь треугольника = ");
        System.out.println(triangle.getSquare());
        System.out.print("Периметр треугольника = ");
        System.out.println(triangle.getPerimetr());

        Ellipse ellipse = new Ellipse(10, 5);
        System.out.print("Площадь элипса = ");
        System.out.println(ellipse.getSquare());
        System.out.print("Периметр элипса = ");
        System.out.println(ellipse.getPerimetr());
    }
}
