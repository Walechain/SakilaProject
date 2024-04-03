public class Main {
    public static void main(String[] args) {
        // Calling static methods without creating an instance of MathOperations
        int squareResult = MathOperations.square(5);
        int cubeResult = MathOperations.cube(3);

        // Displaying the results
        System.out.println("Square of 5: " + squareResult);
        System.out.println("Cube of 3: " + cubeResult);
    }
}