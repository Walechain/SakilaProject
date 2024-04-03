public class Main {
    public static void main(String[] args) {
        // how to print
        System.out.println("Hello world!");
        // how to create an object called u from User class set attributes
        User u = new User("Caleb", "Silver");
        User u2 = new User();
        // how to get name in main
        System.out.println(u.get_name());
        System.out.println(u.get_membership());
        System.out.println(u2.get_membership());




    }
}