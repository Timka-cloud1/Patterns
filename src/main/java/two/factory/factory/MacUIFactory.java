package two.factory.factory;

import two.factory.ui.Button;
import two.factory.ui.Select;
import two.factory.ui.TextField;
import two.factory.ui.mac.MacButton;
import two.factory.ui.mac.MacSelect;
import two.factory.ui.mac.MacTextField;
import two.factory.ui.nix.LinuxButton;

public class MacUIFactory implements AbstractUIFactory{
    @Override
    public Button getButton() {
        System.out.println("Mac button created");
        return new MacButton();
    }

    @Override
    public Select getSelect() {
        System.out.println("Mac select created");
        return new MacSelect();
    }

    @Override
    public TextField getTextField() {
        System.out.println("Mac textField created");
        return new MacTextField();
    }
}
