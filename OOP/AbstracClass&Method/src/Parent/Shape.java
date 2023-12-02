package Parent;

public abstract class Shape {
    private String color;

    public Shape(){
        super();
    }

    public Shape(String color){
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();
}
