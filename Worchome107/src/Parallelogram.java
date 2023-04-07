public  class Parallelogram extends Figure{
    private static final String NAME = "Параллелограмм";
    private double a;
    private double b;
    private double alpha;

    public Parallelogram(double a, double b, double alpha) {
        this.a = a;
        this.b = b;
        this.alpha = alpha;
        recalculateProperties();
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
        recalculateProperties();
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
        recalculateProperties();
    }
    public double getAlpha() {
        return alpha;
    }
    public void setAlpha(double alpha) {
        this.alpha = alpha;
        recalculateProperties();
    }
    @Override
    protected void recalculateProperties() {
        perimeter = 2.0 * (a + b);
        area = a * b * Math.sin(alpha);
    }
    public String getName() {
        return NAME;
    }
}