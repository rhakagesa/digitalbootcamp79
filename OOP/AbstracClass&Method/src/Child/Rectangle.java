package Child;

import Parent.Shape;

public class Rectangle extends Shape {
    private double p;
    private double l;

    public Rectangle(){

    }

    public Rectangle(String color, double p, double l){
        setColor(color);
        this.p = p;
        this.l = l;
    }

    @Override
    public double getArea() {
        return p * l;
    }


}
