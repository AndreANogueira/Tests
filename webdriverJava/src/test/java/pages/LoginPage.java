package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver navegador;

    public LoginPage(WebDriver navegador){
        this.navegador = navegador;
    }

    public LoginHomePage clickEntrar(){

        navegador.findElement(By.className("button")).click();

        return new LoginHomePage(navegador);
    }

    public LoginPage preecherNome(){

        WebElement name = navegador.findElement(By.name("username"));
        name.sendKeys("andre.avelar");

        return this;
    }

    public LoginPage preecherPassword(){

        WebElement password = navegador.findElement(By.name("password"));
        password.sendKeys("123456");

        return this;
    }
}
