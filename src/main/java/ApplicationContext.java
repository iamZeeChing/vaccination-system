/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java;

import main.java.pages.PersonalInfoPage.PersonalInfoPage;
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
    PersonalInfoPage personalInfoPage;
    String currentUsername;
    String currentMode;

    public ApplicationContext() throws FileNotFoundException {
        this.loginPage = new LoginPage(this);
        this.registerPage = new RegisterPage(this);
        this.personalInfoPage = new PersonalInfoPage(this);
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }


    public RegisterPage getRegisterPage() {
        return registerPage;
    }

    public PersonalInfoPage getPersonalInfoPage() {
        return personalInfoPage;
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