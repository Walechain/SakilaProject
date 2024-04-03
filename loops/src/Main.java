public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //for (initialization; condition; update) {
            // Code to be executed }

        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);

        }
        /* while (condition) {
    // Code to be executed
}*/
        int count = 0;
        while (count < 5) {
            System.out.println("Count: " + count);
            count++;
        }
// do-while loop is similar to the while loop, but it executes the block of code at least once before checking the condition.
        /*do {
    // Code to be executed
} while (condition);*/
        int num = 0;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num < 5);

        // for-each loop simplifies iterating over elements in an array or collection.
/*for (element_type element : array_or_collection) {
    // Code to be executed
}*/
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }

}