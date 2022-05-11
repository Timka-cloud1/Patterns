package structuralPatterns.adapter.first;

import java.util.ArrayList;
import java.util.List;

public class AdapterClient {
    public static void main(String[] args) {
        List<Roundable> roundables = new ArrayList<>();
        roundables.add(new Circle(3));
        roundables.add(new SquareRoundableAdapter(3));
    }
}
