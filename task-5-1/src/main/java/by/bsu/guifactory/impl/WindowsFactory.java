package by.bsu.guifactory.impl;

import by.bsu.button.Button;
import by.bsu.button.impl.WindowsButton;
import by.bsu.checkbox.Checkbox;
import by.bsu.checkbox.impl.WindowsCheckbox;
import by.bsu.guifactory.GUIFactory;

public class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
