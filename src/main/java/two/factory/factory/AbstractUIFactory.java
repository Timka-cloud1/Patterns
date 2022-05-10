package two.factory.factory;


import two.factory.ui.Button;
import two.factory.ui.Select;
import two.factory.ui.TextField;

public interface AbstractUIFactory {
    Button getButton();
    Select getSelect();
    TextField getTextField();
}
