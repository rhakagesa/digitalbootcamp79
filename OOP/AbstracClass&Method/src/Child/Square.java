package Child;

import Parent.Shape;

public class Square extends Shape {
    private double s;
    
    public Square(){

    }

    public Square(String color, double s){
        setColor(color);
        this.s = s;
    }

    @Override
    public double getArea() {
        return s * s;
    }
}
