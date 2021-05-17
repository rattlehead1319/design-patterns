public class DclSingletonDemo {

    public static void main (String[] args) {
        DclSingleton dcl = DclSingleton.getInstance();
        dcl.sayHello();
    }
}
