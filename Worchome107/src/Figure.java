public abstract class Figure {
    protected double area;
    protected double perimeter;
    protected double name;


    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
    public String getName() {
        return String.valueOf(name);


    }

    protected abstract void recalculateProperties();
}

