package creationalPatterns.two.factory.factory;

import creationalPatterns.two.factory.ui.Button;
import creationalPatterns.two.factory.ui.Select;
import creationalPatterns.two.factory.ui.TextField;
import creationalPatterns.two.factory.ui.mac.MacButton;
import creationalPatterns.two.factory.ui.mac.MacSelect;
import creationalPatterns.two.factory.ui.mac.MacTextField;

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
