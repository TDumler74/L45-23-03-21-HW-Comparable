package homework_L45_2;

public class Rectangle extends Area {
    int sideA;
    int sideB;
    double area;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public double getArea() {
        return sideA * sideB;
    }

}

