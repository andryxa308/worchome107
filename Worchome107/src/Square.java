public  class Square extends Figure {
    private static final String NAME = "Квадрат";
    private double a;

    public Square(final double a) {
        this.a = a;
        recalculateProperties();
    }

    @Override
    protected void recalculateProperties() {
        area = a * a;
        perimeter = 4 * a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
        recalculateProperties();
    }
    public String getName() {
        return NAME;
    }

}