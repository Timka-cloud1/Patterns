package structuralPatterns.adapter.first;

public class SquareRoundableAdapter extends Square implements Roundable {
    // это первая техника, наследоваться от класса и имплеминтить нужный интерфейс
    public SquareRoundableAdapter(double side) {
        super(side);
    }

    @Override
    public double getRadius() {
        return getSide() * Math.sqrt(2) / 2;
    }
}
