class Parent {
    private int x;

    // Constructor with one parameter
    public Parent(int x) {
        this.x = x;
        System.out.println("Parent constructor with one parameter: " + x);
    }

    // Constructor with two parameters
    public Parent(int x, int y) {
        this(x); // Calling the constructor with one parameter
        System.out.println("Parent constructor with two parameters: " + x + ", " + y);
    }
}

