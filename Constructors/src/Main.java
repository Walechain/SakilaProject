public class Main {
    public static void main(String[] args) {
        // how to print
        System.out.println("Hello world!");
        // how to create an object called u from User class
        User u = new User();
        // how to set name in main
        u.set_name("Ade");
        u.set_membership(User.Membership.Gold);
        u.age = 15;
        // how to get name in main
        System.out.println(u.get_name());
        System.out.println(u.get_membership());


    }
}