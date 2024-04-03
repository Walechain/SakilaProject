public class Main {
    public static void main(String[] args) {
        // how to print
        System.out.println("Hello world!");
        // how to create an object called u from User class
        User u = new User();
        // storing name, membership and age from attributes created in User class
        // u.name = "Ade";
        //works in the same way as above
//        u._name = "Ade";
//        u.membership = "Gold";
//        u.age = 15;

        // how to set name in main
        u.set_name("Ade");
        u.membership = "Gold";
        u.age = 15;
        // how to get name in main
        System.out.println(u.get_name());


//        // creating a second object
//        User u2 = new User();
//        u2.name = "Sally";
//        u2.membership = "sliver";



//        System.out.println(u.name);
//        System.err.println(u2.name);
//        System.out.println(u.age);
    }
}