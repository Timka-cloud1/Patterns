package singleton;

public class ThreadSafeLazySingleton {
    private static ThreadSafeLazySingleton instance;

    public static synchronized ThreadSafeLazySingleton getInstance() {
        if(instance == null) {
            instance =  new ThreadSafeLazySingleton();
        }
        return instance;
    }
}
