public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling the add methods with different parameters
        int sum1 = calc.add(5, 10);
        int sum2 = calc.add(5, 10, 15);
        double sum3 = calc.add(2.5, 3.5);

        // Displaying the results
        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of three integers: " + sum2);
        System.out.println("Sum of two doubles: " + sum3);
    }
}