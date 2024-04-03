public class Main {
    public static void main(String[] args) {
        // Creating objects of concrete subclasses
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        // Calling methods
        circle.display();
        System.out.println("Area of circle: " + circle.area());

        rectangle.display();
        System.out.println("Area of rectangle: " + rectangle.area());
    }
}