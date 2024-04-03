public class Main {
    public static void main(String[] args) {
        // Creating instances of the Counter class
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // Displaying the count of instances using the static method
        System.out.println("Number of instances created: " + Counter.getCount());
    }
}