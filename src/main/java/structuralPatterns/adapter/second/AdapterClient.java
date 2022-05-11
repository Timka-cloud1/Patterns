package structuralPatterns.adapter.second;

import java.util.ArrayList;
import java.util.List;

public class AdapterClient {
    public static void main(String[] args) {
        List<Roundable> roundables = new ArrayList<>();
        roundables.add(new Circle(3));
        Square square = new Square(3);
        roundables.add(new SquareRoundableAdapter(square));
    }
}
