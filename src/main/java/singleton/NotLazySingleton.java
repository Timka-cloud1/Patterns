package singleton;

public class NotLazySingleton {
    private static NotLazySingleton INSTANCE = new NotLazySingleton();

    private NotLazySingleton() {
    }

    public static NotLazySingleton getInstance() {
        return INSTANCE;
    }
}
