package by.bsu;

import by.bsu.application.Application;
import by.bsu.guifactory.GUIFactory;
import by.bsu.guifactory.impl.MacOsFactory;
import by.bsu.guifactory.impl.WindowsFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory macOsFactory = new MacOsFactory();
        GUIFactory windowsFactory = new WindowsFactory();

        Application windowsApplication = new Application(windowsFactory);
        Application macOsApplication = new Application(macOsFactory);

        windowsApplication.paint();
        macOsApplication.paint();
    }
}
