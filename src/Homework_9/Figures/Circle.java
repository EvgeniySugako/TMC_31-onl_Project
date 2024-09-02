package Homework_9.Figures;

public class Circle extends Figures{
    private double r;

    Circle(double r){
        this.r = r;
    }

    @Override
    double getPerimeter() {
        return 2 * 3.1415 * this.r;
    }

    @Override
    double getSquare() {
        return 3.1415 * this.r * this.r;
    }
}
