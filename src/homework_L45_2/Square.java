package homework_L45_2;

public class Square extends Area {
double sideA;
double area;
public Square(double sideA){
    this.sideA=sideA;
}
    public double getArea() {
        return sideA*sideA;
    }
    @Override
    public String toString() {
        return "square =" + getArea();
    }
}
