/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java;

import main.java.pages.CommitteeMainPage.CommitteeMainPage;
import main.java.pages.LoginPage.LoginPage;
import main.java.pages.RegisterPage.RegisterPage;

import java.io.FileNotFoundException;

/**
 *
 * @author hansheng
 */
public class ApplicationContext {
    LoginPage loginPage;
    RegisterPage registerPage;
    CommitteeMainPage committeeMainPage;
    String currentUsername;
    String currentMode;

    public ApplicationContext() throws FileNotFoundException {
        this.loginPage = new LoginPage(this);
        this.registerPage = new RegisterPage(this);
        this.committeeMainPage = new CommitteeMainPage(this);
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }


    public RegisterPage getRegisterPage() {
        return registerPage;
    }

    public CommitteeMainPage getPersonalInfoPage() {
        return committeeMainPage;
    }

    public String getCurrentUsername() {
        return currentUsername;
    }

    public void setCurrentUsername(String currentUsername) {
        this.currentUsername = currentUsername;
    }

    public String getCurrentMode() {
        return currentMode;
    }

    public void setCurrentMode(String currentMode) {
        this.currentMode = currentMode;
    }

    public static void main(String[] args) throws FileNotFoundException {
        ApplicationContext applicationContext = new ApplicationContext();
        applicationContext.loginPage.setVisible(true);
    }
}
