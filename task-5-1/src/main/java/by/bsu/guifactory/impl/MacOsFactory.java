package by.bsu.guifactory.impl;

import by.bsu.button.Button;
import by.bsu.button.impl.MacOSButton;
import by.bsu.checkbox.Checkbox;
import by.bsu.checkbox.impl.MacOsCheckbox;
import by.bsu.guifactory.GUIFactory;

public class MacOsFactory implements GUIFactory {
    public Button createButton() {
        return new MacOSButton();
    }

    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}
