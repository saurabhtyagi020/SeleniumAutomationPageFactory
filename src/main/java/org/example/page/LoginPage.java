package org.example.page;

import org.example.util.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.driver.DriverManager.getDriver;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='login-username']")
    private WebElement user_email;

    @FindBy(xpath = "//input[@id='login-password']")
    private WebElement email_pass;

    @FindBy(xpath = "//button[@id='js-login-btn']")
    private WebElement signInbutton;

    public void loginToVwo(String user,String password)
    {
        getDriver().get(PropertiesReader.readKey("url"));
        user_email.sendKeys(user);
        email_pass.sendKeys(password);
        signInbutton.click();
    }
}
