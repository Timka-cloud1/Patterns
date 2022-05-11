package structuralPatterns.adapter.second;

public class SquareRoundableAdapter implements Roundable{
    // это вторая техника, передовать обьект в конструктор
    private final Square square;

    public SquareRoundableAdapter(Square square) {
        this.square = square;
    }
    @Override
    public double getRadius() {
        return square.getSide() * Math.sqrt(2) / 2;
    }
}
