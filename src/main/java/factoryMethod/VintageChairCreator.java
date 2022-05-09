package factoryMethod;

public class VintageChairCreator implements ChairCreator {
    @Override
    public Chair createChair() {
        return new VintageChair();
    }
}
