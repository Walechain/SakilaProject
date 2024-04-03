public class Counter {
    // Static data member to count the number of instances created
    private static int count = 0;

    // Constructor increments the count when an instance is created
    public Counter() {
        count++;
    }

    // Static method to get the count of instances created
    public static int getCount() {
        return count;
    }
}
