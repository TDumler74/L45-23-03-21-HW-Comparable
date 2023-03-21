package homework_L45_2;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Area>shapes= new ArrayList<>();

        shapes.add( new Circle(2));
        shapes.add( new Circle(5));

        shapes.add(new Rectangle(10,4));
        shapes.add(new Rectangle(4,5));

        shapes.add(new Square(1));
        shapes.add(new Square(12));

        Collections.sort(shapes);
        System.out.println(shapes);

        //[square = 1.0, circle = 12.56, rectagle = 20.0, rectagle = 40.0, circle = 78.5, square = 144.0]













    }
}
