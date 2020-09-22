package com.templateJavaAppium.tests;
import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomePage;
import com.templateJavaAppium.pages.LoginPage;
import com.templateJavaAppium.pages.ProjetosLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    LoginPage loginPage;
    HomePage homePage;

    @Test
    public void verificaAcessoNegado() {

        String textoEsperado = "You gave me the wrong username and password";
        String usuario = "usuario";
        String senha = "senha";

        homePage = new HomePage();
        loginPage = new LoginPage();

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuLogin();
        loginPage.preencheUsuario(usuario);
        loginPage.preencheSenha(senha);
        loginPage.clickEntrarButton();
        String msgRetornada = loginPage.retornaMensagemErroLogin();

        Assert.assertEquals(textoEsperado, msgRetornada);
    }

    @Test
    public void verificaBotaoTryAgain() {

        String usuario = "usuario";
        String senha = "senha";

        homePage = new HomePage();
        loginPage = new LoginPage();

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuLogin();
        loginPage.preencheUsuario(usuario);
        loginPage.preencheSenha(senha);
        loginPage.clickEntrarButton();
        loginPage.clicaTryAgain();
        boolean existeBotao = loginPage.verificaExistenciaCampoUsuario();

        Assert.assertTrue(existeBotao);
    }


}