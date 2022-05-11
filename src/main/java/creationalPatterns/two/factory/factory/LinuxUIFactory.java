package creationalPatterns.two.factory.factory;

import creationalPatterns.two.factory.ui.Button;
import creationalPatterns.two.factory.ui.Select;
import creationalPatterns.two.factory.ui.TextField;
import creationalPatterns.two.factory.ui.nix.LinuxButton;
import creationalPatterns.two.factory.ui.nix.LinuxSelect;
import creationalPatterns.two.factory.ui.nix.LinuxTextField;

public class LinuxUIFactory implements AbstractUIFactory{
    @Override
    public Button getButton() {
        System.out.println("Linux button created");
        return new LinuxButton();
    }

    @Override
    public Select getSelect() {
        System.out.println("Linux select created");
        return new LinuxSelect();
    }

    @Override
    public TextField getTextField() {
        System.out.println("Linux textField created");
        return new LinuxTextField();
    }
}
