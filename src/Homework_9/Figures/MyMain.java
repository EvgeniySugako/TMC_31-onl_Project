package Homework_9.Figures;

/*
Задача 2:
Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать функцию подсчета площади для каждого
типа фигуры и подсчет периметра (используя абстрактный класс/методы). Создать массив из 5 разных фигур.
Вывести на экран сумму периметра всех фигур в массиве.
 */

public class MyMain {
    public static void main(String[] args) {

        Figures[] figures = new Figures[]{
                new Triangle(1,2,3),
                new Rectangle(4,5),
                new Circle(6),
                new Triangle(7,8,9),
                new Rectangle(10,11)
        };

        double sumOfPerimeter = 0;

        for (Figures counter: figures){
            System.out.println(" Perimeter = " + counter.getPerimeter() + " Square = " + counter.getSquare());
            sumOfPerimeter += counter.getPerimeter();
        }
        System.out.println("Сумма периметра всех фигур в массиве = " + sumOfPerimeter);


    }
}
