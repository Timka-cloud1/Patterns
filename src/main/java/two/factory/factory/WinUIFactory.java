package two.factory.factory;

import two.factory.ui.Button;
import two.factory.ui.Select;
import two.factory.ui.TextField;
import two.factory.ui.mac.MacButton;
import two.factory.ui.win.WinButton;
import two.factory.ui.win.WinSelect;
import two.factory.ui.win.WinTextField;

public class WinUIFactory implements AbstractUIFactory{
    @Override
    public Button getButton() {
        System.out.println("Win button created");
        return new WinButton();
    }

    @Override
    public Select getSelect() {
        System.out.println("Win select created");
        return new WinSelect();
    }

    @Override
    public TextField getTextField() {
        System.out.println("Win textField created");
        return new WinTextField();
    }
}
