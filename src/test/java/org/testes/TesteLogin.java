package org.testes;

import org.actions.LoginActions;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteLogin {
    static WebDriver driver;
    static LoginActions actLogin;

    @BeforeAll
    void abrirBrowse(){
        System.setProperty("webdriver.chrome.driver","C:/Users/André/Desktop/Automação/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

       actLogin = new LoginActions(driver);


    }

    @Test
   public void logando ()  {
        new LoginActions(driver).login();

    //actLogin.login();



    }

}
