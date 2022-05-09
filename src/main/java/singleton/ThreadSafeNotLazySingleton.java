package singleton;

public class ThreadSafeNotLazySingleton {
    public static final ThreadSafeNotLazySingleton INSTANCE = new ThreadSafeNotLazySingleton(); //threadsafe
}
