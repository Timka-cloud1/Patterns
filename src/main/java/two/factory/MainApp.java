package two.factory;

import two.factory.factory.AbstractUIFactory;
import two.factory.factory.LinuxUIFactory;
import two.factory.factory.MacUIFactory;
import two.factory.factory.WinUIFactory;
import two.factory.ui.Button;
import two.factory.ui.Select;
import two.factory.ui.TextField;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Create Win UI");
        createUI(createFactory(OperationSystem.WIN));
        System.out.println("------------------------------");
        System.out.println("Create Mac UI");
        createUI(createFactory(OperationSystem.MAC));
        System.out.println("------------------------------");
        System.out.println("Create Linux UI");
        createUI(createFactory(OperationSystem.LINUX));


    }

    private static AbstractUIFactory createFactory(OperationSystem operationSystem) { // Это фабричный метод
        // как правило используется для инициализации абстрактный фабрики, тоесть у нас есть какой то метод который сам по себе
        // знает какую именно фабрику отдаст
        switch (operationSystem) {
            case MAC: return new MacUIFactory();
            case WIN: return new WinUIFactory();
            case LINUX: return new LinuxUIFactory();
            default: throw new IllegalArgumentException("Unsupported operation system");
        }
    }

    private static void createUI(AbstractUIFactory factory) {
        final Button button = factory.getButton();
        final TextField textField = factory.getTextField();
        final Select select = factory.getSelect();
        System.out.println("UI created with " + button + textField + select);
    }

    private enum OperationSystem{
        WIN, MAC, LINUX
    }
}
