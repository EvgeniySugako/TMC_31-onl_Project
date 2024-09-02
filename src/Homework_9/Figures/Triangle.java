package Homework_9.Figures;

import static java.lang.Math.sqrt;

public class Triangle extends Figures {
    private double a;
    private double b;
    private double c;

    Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getPerimeter() {
        return this.a + this.b + this.c;
    }

    @Override
    double getSquare() {
        double d;
        d = (a + b + c)/2;

        return sqrt(d*(d - this.a)*(d - this.b)*(d - this.c));
    }
}
