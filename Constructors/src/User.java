public class User {
    //attributes creates
    // we know only for class use if we want to talk about it outside of class just name
    //String _name;

    // can only use underscore name inside class file can't be used in main for example
    private String _name;
    private String _membership;
    int age;

    //set method
    // sets the value
    void set_name(String name) {
        _name = name;

    }

    void set_membership(String membership) {
        _membership = membership;
    }

    // Membership is the instance of class / enum( which is used to store constants)
    // membership is the variable name of type Membership
    // in this case only possible types are Gold, Silver, Bronze
    void set_membership(Membership membership) {
        _membership = membership.name();
    }

    public enum Membership {
        Bronze, Silver, Gold;
    }
    //get returns the value
    String get_name(){
        return _name;
    }
    String get_membership(){
        return _membership;
    }
}