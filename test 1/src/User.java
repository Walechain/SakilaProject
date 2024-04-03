public class User {
    //attributes creates
    // we know only for class use if we want to talk about it outside of class just name
    //String _name;

    // can only use underscore name inside class file can't be used in main for example
    private String _name;
    String membership;
    int age;

    //set method
    // sets the value
    void set_name(String name) {
        System.out.println("Running log file ");
        // if we kept String name we would label _name as this.name instead
        _name = name;

    }
    //get returns the value
    String get_name(){
        return _name;
    }
}
