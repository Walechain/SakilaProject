// Concrete subclass 1
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of the abstract method
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
