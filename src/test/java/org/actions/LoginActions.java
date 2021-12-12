package org.actions;

import org.obj.LoginObj;
import org.openqa.selenium.WebDriver;

public class LoginActions {
    static LoginObj obs;

public LoginActions(WebDriver driver) {
        obs = new LoginObj(driver);
}

    public static void login(){
        obs.getInputUserName().sendKeys("standard_user");
        obs.getBtnLogin().sendKeys("secret_sauce");
        obs.getBtnLogin().click();

    }


}
