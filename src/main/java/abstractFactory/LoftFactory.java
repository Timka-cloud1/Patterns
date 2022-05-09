package abstractFactory;

public class LoftFactory implements AbstractFactory {
    @Override
    public Chair createChair() {
        return new LoftChair();
    }

    @Override
    public Table createTable() {
        return new LoftTable();
    }
}
