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
import pages.LoginPage;
import suporte.Generator;
import suporte.Screenshot;
import suporte.Web;

public class loginTest {
    private WebDriver navegador;

    @Rule
    public TestName test = new TestName();


    @Before
    public void setUp(){
        navegador = Web.createChrome();
    }

    @Test
    public void testLogin(){

        //Preenchcer login e senha
        new LoginPage(navegador)
                .preecherNome()
                .preecherPassword();

        //Acessar aplicação
        new LoginPage(navegador)
                .clickEntrar();

        //Documentar acesso
        String screnshotName = "C:\\Users\\André\\IdeaProjects\\TestReport\\" + Generator.dataHoraAquirvo() + test.getMethodName() + ".png";
        Screenshot.tirar(navegador, screnshotName);

    }

    @Test
    public void testLoginInvalido(){

        //Preenchcer login e senha
        new LoginPage(navegador)
                .preecherNome()
                .preecherPassword();

        //Acessar aplicação
        new LoginPage(navegador)
                .clickEntrar();

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
