package homework_L45_2;
/*
В задаче из урока 40 вывести на печать массив ,отсортированный по возрастанию
 площади фигур.

Задача была такая:

Создать классы, содержащие методы для подсчета площади
прямоугольника, квадрата, круга: Создать классы Circle, Rectangle, Square.
 В классах должен быть метод getArea, осуществляющий подсчет соответствующей
 площади В методе main класса Main создать массив или лист содержащий обьекты
  этих классов и вывести на экран площади фигур, содержащиеся в этом массиве
  а также название фигуры. Подумать, должны ли быть созданы для выполнения
задачи еще какие-то классы/класс и поля в классе/классах
 */


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
