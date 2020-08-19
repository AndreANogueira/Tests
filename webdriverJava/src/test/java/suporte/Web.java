package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createChrome(){
        //Abrindo navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\André\\IdeaProjects\\Driver\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Página Web
        navegador.get("http://mantis-prova.base2.com.br");

        return navegador;
    }
}
