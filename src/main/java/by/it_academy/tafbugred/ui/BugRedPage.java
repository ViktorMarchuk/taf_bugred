package by.it_academy.tafbugred.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BugRedPage extends BasePage{
    private WebDriver driver;
    public final String URL = "http://users.bugred.ru/";
    public final String NAME = "Имя";
    public final String PASSWORD = "Пароль";
    public final String EMAIL = "Email";
    public final String BUTTON_REGISTER = "Зарегистрироваться";
    public final String REGISTER = "Регистрация";

    public final String EMAIL_FIELD_ENTER = "Email";
    public final String PASSWORD_FIELD_ENTER = "Пароль";
    public final String AUTHORIZATION_FIELD_ENTER = "Авторизоваться";
    public final String NAME_ENTER_FIELD_ENTER = "Вход";
    public final String NAME_OF_TOP_FIELD_ENTER="С помощью формы ниже,вы сможете авторизоваться на нашем ресурсе";

    private String xPathButtonEnterFieldRegistration = "//a[@href='/user/login/index.html']";
    private String xPathNameFieldRegistration = "//form[@action='/user/register/index.html']/table/tbody/tr[1]/td[1]";
    private String xPathEmailFieldRegistration = "//form[@action='/user/register/index.html']/table/tbody/tr[2]/td[1]";
    private String xPathPasswordFieldRegistration = "//form[@action='/user/register/index.html']/table/tbody/tr[3]/td[1]";
    private String xPathNameButtonRegisterFieldRegistration = "//input[@name=\"act_register_now\"]";//"//form[@action='/user/register/index.html']/table/tbody/tr[4]/td[2]/input";
    private String xPathRegister = "//div[@class='col-md-6'][2]/h2";

    private String xPathEmailFieldEnter = "//div[@class='col-md-6'][1]/form/table/tbody/tr[1]/td[1]";
    private String xPathPasswordFieldEnter = "//div[@class='col-md-6'][1]/form/table/tbody/tr[2]/td[1]";
    private String xPathNameButtonAuthorisationFieldEnter = "//div[@class='col-md-6'][1]/form/table/tbody/tr[3]/td[2]/input";
    private String xPathNameEnter = "//div[@class='col-md-6'][1]/h2";
    private String xPathNameOfTop = "//div[@class='col-md-6'][1]/p";


    public BugRedPage(WebDriver driver){
        this.driver = driver;
    }

    public void openPage(String url){
        driver.navigate().to(url);
    }

    public void clickButtonEnter(){
        By buttonEnter = new By.ByXPath(xPathButtonEnterFieldRegistration);
        WebElement buttonEnterElement = driver.findElement(buttonEnter);
        buttonEnterElement.click();
    }

    public String getTextName(){
        By name = new By.ByXPath(xPathNameFieldRegistration);
        WebElement nameElement = driver.findElement(name);
        return nameElement.getText();
    }

    public String getTextEmail(){
        By eMail = new By.ByXPath(xPathEmailFieldRegistration);
        WebElement eMailElement = driver.findElement(eMail);
        return eMailElement.getText();
    }

    public String getTextPassword(){
        By password = new By.ByXPath(xPathPasswordFieldRegistration);
        WebElement passwordElement = driver.findElement(password);
        return passwordElement.getText();
    }

    public String getTextNameButtonRegister(){
        By nameButtonRegister = new By.ByXPath(xPathNameButtonRegisterFieldRegistration);
        WebElement nameButtonRegisterElement = driver.findElement(nameButtonRegister);
        return nameButtonRegisterElement.getText();
    }

    public String getTextRegister(){
        By register = new By.ByXPath(xPathRegister);
        WebElement registerElement = driver.findElement(register);
        return registerElement.getText();
    }

    public String getTextEmailFieldEnter(){
        By emailFieldEnter = new By.ByXPath(xPathEmailFieldEnter);
        WebElement emailFieldEnterElement = driver.findElement(emailFieldEnter);
        return emailFieldEnterElement.getText();
    }

    public String getTextPasswordFieldEnter(){
        By passwordFieldEnter = new By.ByXPath(xPathPasswordFieldEnter);
        WebElement passwordFieldEnterElement = driver.findElement(passwordFieldEnter);
        return passwordFieldEnterElement.getText();
    }

    public String getNameButtonAuthorisationFieldEnter(){
        By nameButtonAuthorisationFieldEnter = new By.ByXPath(xPathNameButtonAuthorisationFieldEnter);
        WebElement nameButtonAuthorisationFieldEnterElement = driver.findElement(nameButtonAuthorisationFieldEnter);
        return nameButtonAuthorisationFieldEnterElement.getText();
    }

    public String getTextNameEnter(){
        By nameEnter = new By.ByXPath(xPathNameEnter);
        WebElement nameEnterElement = driver.findElement(nameEnter);
        return nameEnterElement.getText();
    }

    public String getTextNameOfTop(){
        By nameOfTop = new By.ByXPath(xPathNameOfTop);
        WebElement nameOfTopElement = driver.findElement(nameOfTop);
        return nameOfTopElement.getText();
    }
}

