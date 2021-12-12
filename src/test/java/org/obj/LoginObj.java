package org.obj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObj {
    private WebDriver driver;

    @FindBy(id = "user-name")
    private WebElement inputUserName;

    @FindBy(css = "input[id='password']")
    private WebElement inputPassword;

    @FindBy(css = "input[id='login-button']")
    private WebElement btnLogin;

    public LoginObj(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getInputUserName() {
        return inputUserName;
    }

    public void setInputUserName(WebElement inputUserName) {
        this.inputUserName = inputUserName;
    }

    public WebElement getInputPassword() {
        return inputPassword;
    }

    public void setInputPassword(WebElement inputPassword) {
        this.inputPassword = inputPassword;
    }

    public WebElement getBtnLogin() {
        return btnLogin;
    }

    public void setBtnLogin(WebElement btnLogin) {
        this.btnLogin = btnLogin;
    }
}
