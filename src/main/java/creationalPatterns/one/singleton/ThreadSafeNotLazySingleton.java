package creationalPatterns.one.singleton;

public class ThreadSafeNotLazySingleton {
    private ThreadSafeNotLazySingleton() {

    }
    public static final ThreadSafeNotLazySingleton INSTANCE = new ThreadSafeNotLazySingleton(); //threadsafe
}
