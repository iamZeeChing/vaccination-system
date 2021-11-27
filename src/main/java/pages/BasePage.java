package main.java.pages;

import main.java.ApplicationContext;

import javax.swing.*;
import java.io.FileNotFoundException;

public abstract class BasePage extends JFrame {
    protected ApplicationContext applicationContext;

    public BasePage(ApplicationContext applicationContext) throws FileNotFoundException {
        initComponents();
        this.applicationContext = applicationContext;
    }

    public abstract void initComponents() throws FileNotFoundException;
}
