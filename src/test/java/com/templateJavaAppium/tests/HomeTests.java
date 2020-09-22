package com.templateJavaAppium.tests;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomePage;
import com.templateJavaAppium.pages.ProjetosLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTests extends TestBase
{

    ProjetosLoginPage projetosLoginPage;
    HomePage homePage;

    @Test
    public void verificaTextoPrincipalHome()
    {
        homePage = new HomePage();

        String textoEsperado = "AWS Device Farm Sample App for Android";

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuHome();
        String textoRetornado = homePage.retornaTextoPrincipalHome();

        Assert.assertEquals(textoRetornado, textoEsperado);
    }

    @Test
    public void verificaVersaoHome()
    {
        homePage = new HomePage();

        String versaoEsperada = "version 1";

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuHome();
        String versaoRetornada = homePage.retornaTextoVersaoHome();

        Assert.assertEquals(versaoRetornada, versaoEsperada);
    }
}
