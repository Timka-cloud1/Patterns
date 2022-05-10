package one.abstractFactory;

public class ModernFactory implements AbstractFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {

        return new ModernTable();
    }
}
