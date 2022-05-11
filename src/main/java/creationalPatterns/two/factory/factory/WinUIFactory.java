package creationalPatterns.two.factory.factory;

import creationalPatterns.two.factory.ui.Button;
import creationalPatterns.two.factory.ui.Select;
import creationalPatterns.two.factory.ui.TextField;
import creationalPatterns.two.factory.ui.win.WinButton;
import creationalPatterns.two.factory.ui.win.WinSelect;
import creationalPatterns.two.factory.ui.win.WinTextField;

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
