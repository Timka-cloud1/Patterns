package creationalPatterns.two.factory.factory;


import creationalPatterns.two.factory.ui.Button;
import creationalPatterns.two.factory.ui.Select;
import creationalPatterns.two.factory.ui.TextField;

public interface AbstractUIFactory {
    Button getButton();
    Select getSelect();
    TextField getTextField();
}
