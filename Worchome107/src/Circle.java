public  class Circle extends Figure {
    private static final String NAME = "Круг";
    private double r;

    public Circle(double r) {
        this.r = r;
        recalculateProperties();
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;

    }

    @Override
    protected void recalculateProperties() {
        area = Math.PI * r * r;
        perimeter = 2.0 * Math.PI * r;
    }
    public String getName() {
        return NAME;
    }
}