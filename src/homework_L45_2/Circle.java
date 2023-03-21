package homework_L45_2;

public class Circle extends Area {
    double radius;
    double area;


    public Circle(double radius) {
        this.radius = radius;
    }
    public   double getArea() {
        return radius*radius*3.14;
    }

    @Override
    public String toString() {
        return "circle = " + getArea() ;
                    }
}
