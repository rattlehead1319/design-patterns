public class DclSingleton {
    private volatile static DclSingleton instance;

    private DclSingleton () {}

    public static DclSingleton getInstance() {
        if (instance == null) {
            synchronized (DclSingleton.class) {
                if (instance == null) {
                    return new DclSingleton();
                }
            }
        }
        return instance;
    }

    public void sayHello () {
        System.out.println("DCL Hello");
    }
}
