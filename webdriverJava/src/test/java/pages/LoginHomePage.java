package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginHomePage {
    private WebDriver navegador;

    public LoginHomePage(WebDriver navegador){
        this.navegador = navegador;
    }

    public LoginHomePage clickMenuMinhaVisao(){

        navegador.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/a[1]")).click();

        return this;
    }

    public LoginHomePage clickMenuVerProblemas(){

        navegador.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/a[2]")).click();

        return this;
    }

    public LoginHomePage clickMenuReportarProblemas(){

        navegador.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/a[3]"));

        return this;
    }

    public LoginHomePage clickMenuLogDeAlteracao(){

        navegador.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/a[4]"));

        return this;
    }

    public LoginHomePage clickMenuRoteiro(){

        navegador.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/a[5]"));

        return this;
    }

}
