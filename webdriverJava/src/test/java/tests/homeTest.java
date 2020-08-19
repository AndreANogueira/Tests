package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.LoginHomePage;
import pages.LoginPage;
import suporte.Web;

public class homeTest {
    private WebDriver navegador;

    @Before
    public void setUp(){
        navegador = Web.createChrome();
    }

    @After
    public void tearDown(){
        //Fechar navegador - todas abas
        navegador.quit();
    }
    //Teste acesso ao Menu Minha Visão
    @Test
    public void testminhaVisao(){
        new LoginPage(navegador)
                .preecherNome()
                .preecherPassword()
                .clickEntrar();
        //Entrar no menu Minha Visão
        new LoginHomePage(navegador)
                .clickMenuMinhaVisao();

    }
    //Teste acesso ao Menu Ver Problemas
    @Test
    public void testVerProblemas(){
        new LoginPage(navegador)
                .preecherNome()
                .preecherPassword()
                .clickEntrar();
        new LoginHomePage(navegador)
                .clickMenuVerProblemas();
    }

    @Test
    public void testReportarProblemas(){
        new LoginPage(navegador)
                .preecherNome()
                .preecherPassword()
                .clickEntrar();

        new LoginHomePage(navegador)
                .clickMenuReportarProblemas();
    }

    @Test
    public void testLogDeAlteracao(){
        new LoginPage(navegador)
                .preecherNome()
                .preecherPassword()
                .clickEntrar();

        new LoginHomePage(navegador)
                .clickMenuLogDeAlteracao();
    }

    @Test
    public void testRoteiro(){
        new LoginPage(navegador)
                .preecherNome()
                .preecherPassword()
                .clickEntrar();

        new LoginHomePage(navegador)
                .clickMenuRoteiro();
    }
}
