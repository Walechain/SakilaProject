public class Main {
    public static void main(String[] args) {
        // how to print
        System.out.println("Hello world!");
        // how to create an object called u from User class set attributes
        User u = new User("Caleb", "Silver");
        User u2 = new User("Caleb", "Silver");
//        User u2 = new User();
//        System.out.println(u);
//        System.out.println(u2);
//        User u2 = u;
//        this is the same thing both print true
//        System.out.println(u == u2);
        System.out.println(u.equals(u2));




    }
}