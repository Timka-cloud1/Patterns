package creationalPatterns.one.factoryMethod;

public class ModernChairCreator implements ChairCreator {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }
}
