package factoryMethod;

import java.util.Scanner;

public class FabricMain {
    private final ChairCreator chairCreator;

    public FabricMain(ChairCreator chairCreator) {
        this.chairCreator = chairCreator;
    }

    public void bussinessLogic() {
        Chair chair = chairCreator.createChair();
        System.out.println(chair);
    }

    public static void main(String[] args) {
        ChairCreator chairCreator;
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if(line.equals("vintage")) {
            chairCreator = new VintageChairCreator();
        } else {
            chairCreator = new ModernChairCreator();
        }

        new FabricMain(chairCreator).bussinessLogic();
    }
}
