package org.junto;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class UnicaClass {

    static WebDriver driver;

   // public static void main (String [] args){


    //}
    @Test
    public void PrimeiroPasso (){
        System.setProperty("webdriver.chrome.driver","C:/Users/André/Desktop/Automação/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.cssSelector("[id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("[id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        WebElement filtro = driver.findElement(By.cssSelector("[class='product_sort_container']"));
        new Select(filtro).selectByIndex(2);



    }
    @Test
    public void Bemol () {
        System.setProperty("webdriver.chrome.driver","C:/Users/André/Desktop/Automação/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bemol.com.br/simulacao-de-juros");

        driver.switchTo().frame("iframe-bemol");


        driver.findElement(By.id("vencimentoD")).sendKeys("23");
        driver.findElement(By.id("vencimentoM")).sendKeys("11");
        driver.findElement(By.id("vencimentoY")).sendKeys("2018");

        driver.findElement(By.id("pagamentoD")).sendKeys("15");
        driver.findElement(By.id("pagamentoM")).sendKeys("10");
        driver.findElement(By.id("pagamentoY")).sendKeys("2018");

        WebElement valorParcela =  driver.findElement(By.id("prestacao"));
        valorParcela.sendKeys("500");
        valorParcela.submit();

        WebElement resultado = driver.findElement(By.cssSelector("[class='resultContent']"));

        assertEquals("Prestação corrigida: R$ 493,73", resultado.getText());

    }

    @Test
    public void jadlog (){
        System.setProperty("webdriver.chrome.driver","C:/Users/André/Desktop/Automação/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jadlog.com.br/jadlog/simulacao");

        driver.findElement(By.id("origem")).sendKeys("07791080");
        driver.findElement(By.id("destino")).sendKeys("06455030");
        driver.findElement(By.xpath("//*[@id='form_precifica']/div[3]/div[4]/div/input")).click();

        WebElement resultado = driver.findElement(By.cssSelector("#j_idt45_content > span"));

        assertTrue(resultado.getText().contains("R$ 22,79"));
        //assertEquals("R$ 22,79", resultado.getText());

    }

    @Test
    public void lojasReserva () {
        System.setProperty("webdriver.chrome.driver","C:/Users/André/Desktop/Automação/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lojareversa.com.br/bermuda-de-sarja-masculina-slim-preta-puidos/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        driver.findElement(By.id("option40")).click();

        //webDriver.findElement(By.cssSelector("div[id='simuladorCase']")).click();
        //webDriver.findElement(By.cssSelector("input[id='estimate_postcode']")).sendKeys("0267800");
        //webDriver.findElement(By.cssSelector("button[onclick='estimateProductShipping()']")).click();

    }


}
