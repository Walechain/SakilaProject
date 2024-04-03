public class Main {
    public static void main(String[] args) {
        DefaultClass defaultObj = new DefaultClass();
        defaultObj.display(); // Output: This is a default access class.

        PublicClass publicObj = new PublicClass();
        publicObj.display(); // Output: This is a public access class.

        ProtectedClass protectedObj = new ProtectedClass();
        protectedObj.display(); // Output: This is a protected access class.

        PrivateClass privateObj = new PrivateClass();
        // privateObj.display(); // This line will give a compile-time error because the display() method is private.
    }
}