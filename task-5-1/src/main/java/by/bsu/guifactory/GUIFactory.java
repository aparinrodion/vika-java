package by.bsu.guifactory;

import by.bsu.button.Button;
import by.bsu.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
