package homework_L45_2;

public class Area implements Comparable<Area>{
    double area;

    public double getArea() {
        return area;
    }

    @Override
    public int compareTo(Area p){
        return (int) (getArea() - p.getArea());
    }
}



