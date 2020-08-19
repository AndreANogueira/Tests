package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ScreenshotException;
import suporte.Generator;
import suporte.Screenshot;

import java.util.concurrent.TimeUnit;

public class loginTest {
    private WebDriver navegador;

    @Rule
    public TestName test = new TestName();


    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\André\\IdeaProjects\\Driver\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        navegador.get("http://mantis-prova.base2.com.br");
    }

    @Test
    public void testLogin(){

        //Preenchcer login e senha
        WebElement name = navegador.findElement(By.name("username"));
        WebElement password = navegador.findElement(By.name("password"));

        //Acessar aplicação
        WebElement entrar = navegador.findElement(By.className("button"));

        name.sendKeys("andre.avelar");
        password.sendKeys("123456");

        entrar.click();

        //Documentar acesso
        String screnshotName = "C:\\Users\\André\\IdeaProjects\\TestReport\\" + Generator.dataHoraAquirvo() + test.getMethodName() + ".png";
        Screenshot.tirar(navegador, screnshotName);

    }

    @Test
    public void testLoginInvalido(){

        //Preenchcer login e senha
        WebElement name = navegador.findElement(By.name("username"));
        WebElement password = navegador.findElement(By.name("password"));

        //Acessar aplicação
        WebElement entrar = navegador.findElement(By.className("button"));

        name.sendKeys("andre.avela");
        password.sendKeys("123456");
        entrar.click();

        String TextoElement = navegador.findElement(By.xpath("/html/body/div[2]/font/font/font/text()")).getText();
        assertEquals("Your account may be disabled or blocked or the username/password you entered is incorrect.", TextoElement);

        //Documentar acesso
        String screnshotName = "C:\\Users\\André\\IdeaProjects\\TestReport\\" + Generator.dataHoraAquirvo() + test.getMethodName() + ".png";
        Screenshot.tirar(navegador, screnshotName);

    }

    @After
    public void tearDown(){
        //Fechar navegador - todas abas
        navegador.quit();
    }
}
