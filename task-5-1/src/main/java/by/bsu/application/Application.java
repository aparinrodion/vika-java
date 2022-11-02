package by.bsu.application;

import by.bsu.button.Button;
import by.bsu.checkbox.Checkbox;
import by.bsu.guifactory.GUIFactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
