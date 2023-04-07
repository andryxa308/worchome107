


public class Main {
    private static boolean name;
    private static Object area;
    private static Object perimeter;

    public static void main(String[] args) {
        Figure[] figure = {
                new Circle(12.0),
                new Rectangle(2.0, 4.0),
                new Square(5.0),
                new Triangle(3.0, 4.0, 5.0),
                new Parallelogram(2.0, 3.0, 133.0)};
        for (Figure fig : figure) {
            System.out.println(fig.getName() + ": Площадь = " + fig.getArea());
        }
        double sum = 0;
        for (Figure fig : figure) {
            System.out.println(fig.getName() + ": Периметр = " + fig.getPerimeter());
            sum += fig.getPerimeter();
        }
        System.out.println("Периметр всех фигур: " + sum);
    }
}



        
            
            



    




    





 



        





