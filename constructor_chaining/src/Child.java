class Child extends Parent {
    private int y;

    // Constructor with one parameter
    public Child(int x) {
        super(x); // Calling the constructor of the superclass
        System.out.println("Child constructor with one parameter: " + x);
    }

    // Constructor with two parameters
    public Child(int x, int y) {
        this(x); // Calling the constructor with one parameter in the same class
        this.y = y;
        System.out.println("Child constructor with two parameters: " + x + ", " + y);
    }
}