package singleton;

public class OptimizedThreadSafeSingleton {
    // чтобы была актуальная ссылка на instance
    private static volatile OptimizedThreadSafeSingleton instance;
    // у потоков такая модель  что каждый поток хранить у себя копию общей памяти, каждый обьект хранить у себя свою копию памяти и соотственно когда
    // обьек меняет у себя только другие не увидят эти измение, чтобы другие увидели эти изменения нужно из этой локальной памяти потока сливать измение
    // в общую память и сооственно когда поток читает какую то ссылку он должен доставать ее из общей памяти а не из локальной памяти. Это я про volatile
    // У каждого потока есть своя изолированная память и когда мы ставим volatile при чтение мы читаем из общей памяти или записи мы записываем в общую память и сооственно все потоки увидят изменение

    public static OptimizedThreadSafeSingleton getInstance() {
        OptimizedThreadSafeSingleton localInstance = instance;
        if(localInstance == null) {
            synchronized (OptimizedThreadSafeSingleton.class) {
                localInstance = instance;
                if(localInstance == null) {
                    instance = new OptimizedThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

}
