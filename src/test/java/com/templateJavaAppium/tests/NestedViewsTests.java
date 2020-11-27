package com.templateJavaAppium.tests;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomePage;
import com.templateJavaAppium.pages.NestedViewsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NestedViewsTests extends TestBase {

    HomePage homePage;
    NestedViewsPage nestedViewsPage;

    @Test
    public void upNavigationAteUltimoNivel(){
        homePage = new HomePage();
        nestedViewsPage = new NestedViewsPage();

        String primeiraMensagemEsperada = "Press to go to the next level";
        String segundaMensagemEsperada = "Final Level";

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuNestedViews();
        nestedViewsPage.clicaBotaoUpNavigation();
        String primeiraMensagemRecebida = nestedViewsPage.retornaUpNavigationInformation();
        nestedViewsPage.clicaBotaoNextLeveUpNavigation();
        String segundaMensagemRecebida = nestedViewsPage.retornaUpNavigationInformation();

        Assert.assertEquals(primeiraMensagemRecebida, primeiraMensagemEsperada);
        Assert.assertEquals(segundaMensagemRecebida, segundaMensagemEsperada);
    }
    @Test
    public void upNavigationAteUltimoNivelRetornaUmNivel() {
        homePage = new HomePage();
        nestedViewsPage = new NestedViewsPage();

        String primeiraMensagemEsperada = "Press to go to the next level";
        String segundaMensagemEsperada = "Final Level";

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuNestedViews();
        nestedViewsPage.clicaBotaoUpNavigation();
        String primeiraMensagemRecebida = nestedViewsPage.retornaUpNavigationInformation();
        nestedViewsPage.clicaBotaoNextLeveUpNavigation();
        String segundaMensagemRecebida = nestedViewsPage.retornaUpNavigationInformation();
        nestedViewsPage.clicaBotaoVoltar();
        String tercMsgAposVoltar1NivelRecebida = nestedViewsPage.retornaUpNavigationInformation();

        Assert.assertEquals(primeiraMensagemRecebida, primeiraMensagemEsperada);
        Assert.assertEquals(segundaMensagemRecebida, segundaMensagemEsperada);
        Assert.assertEquals(tercMsgAposVoltar1NivelRecebida, primeiraMensagemEsperada);
    }
    @Test
    public void upNavigationAteUltimoNivelRetornaDoisNiveis()  {
        homePage = new HomePage();
        nestedViewsPage = new NestedViewsPage();

        String primeiraMensagemEsperada = "Press to go to the next level";
        String segundaMensagemEsperada = "Final Level";
        String msgTelaInicialEsperada = "Navigation";

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuNestedViews();
        nestedViewsPage.clicaBotaoUpNavigation();
        String primeiraMensagemRecebida = nestedViewsPage.retornaUpNavigationInformation();
        nestedViewsPage.clicaBotaoNextLeveUpNavigation();
        String segundaMensagemRecebida = nestedViewsPage.retornaUpNavigationInformation();
        nestedViewsPage.clicaBotaoVoltar();
        String tercMsgAposVoltar1NivelRecebida = nestedViewsPage.retornaUpNavigationInformation();
        nestedViewsPage.clicaBotaoVoltar();
        String quartaMsgAposVoltar2niveis = nestedViewsPage.retornaMsgTelaPrincipal();

        Assert.assertEquals(primeiraMensagemRecebida, primeiraMensagemEsperada);
        Assert.assertEquals(segundaMensagemRecebida, segundaMensagemEsperada);
        Assert.assertEquals(tercMsgAposVoltar1NivelRecebida, primeiraMensagemEsperada);
        Assert.assertEquals(quartaMsgAposVoltar2niveis, msgTelaInicialEsperada);
    }

    @Test
    public void backNavigation2Niveis()  {
        homePage = new HomePage();
        nestedViewsPage = new NestedViewsPage();

        String primeiraMensagemEsperada = "1";
        String segundaMensagemEsperada = "2";

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuNestedViews();
        nestedViewsPage.clicaBotaoBackNavigation();
        String primeiraMensagemRecebida = nestedViewsPage.retornaCountNextLevelBackInformation();
        nestedViewsPage.clicaBotaoNextLevelBackNavigation();
        String segundaMensagemRecebida = nestedViewsPage.retornaCountNextLevelBackInformation();

        Assert.assertEquals(primeiraMensagemRecebida, primeiraMensagemEsperada);
        Assert.assertEquals(segundaMensagemRecebida, segundaMensagemEsperada);
    }
    @Test
    public void backNavigation4Niveis()  {
        homePage = new HomePage();
        nestedViewsPage = new NestedViewsPage();

        String primeiraMensagemEsperada = "1";
        String segundaMensagemEsperada = "2";
        String terceiraMensagemEsperada = "3";
        String quartaMensagemEsperada = "4";

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuNestedViews();
        nestedViewsPage.clicaBotaoBackNavigation();
        String primeiraMensagemRecebida = nestedViewsPage.retornaCountNextLevelBackInformation();
        nestedViewsPage.clicaBotaoNextLevelBackNavigation();
        String segundaMensagemRecebida = nestedViewsPage.retornaCountNextLevelBackInformation();
        nestedViewsPage.clicaBotaoNextLevelBackNavigation();
        String terceiraMensagemRecebida = nestedViewsPage.retornaCountNextLevelBackInformation();
        nestedViewsPage.clicaBotaoNextLevelBackNavigation();
        String quartaMensagemRecebida = nestedViewsPage.retornaCountNextLevelBackInformation();

        Assert.assertEquals(primeiraMensagemRecebida, primeiraMensagemEsperada);
        Assert.assertEquals(segundaMensagemRecebida, segundaMensagemEsperada);
        Assert.assertEquals(terceiraMensagemRecebida, terceiraMensagemEsperada);
        Assert.assertEquals(quartaMensagemRecebida, quartaMensagemEsperada);
    }

    @Test
    public void backNavigation4NiveisERetorna()  {
        homePage = new HomePage();
        nestedViewsPage = new NestedViewsPage();

        String primeiraMensagemEsperada = "1";
        String segundaMensagemEsperada = "2";
        String terceiraMensagemEsperada = "3";
        String quartaMensagemEsperada = "4";
        String quintaMensagemEsperada = "Navigation";

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuNestedViews();
        nestedViewsPage.clicaBotaoBackNavigation();
        String primeiraMensagemRecebida = nestedViewsPage.retornaCountNextLevelBackInformation();
        nestedViewsPage.clicaBotaoNextLevelBackNavigation();
        String segundaMensagemRecebida = nestedViewsPage.retornaCountNextLevelBackInformation();
        nestedViewsPage.clicaBotaoNextLevelBackNavigation();
        String terceiraMensagemRecebida = nestedViewsPage.retornaCountNextLevelBackInformation();
        nestedViewsPage.clicaBotaoNextLevelBackNavigation();
        String quartaMensagemRecebida = nestedViewsPage.retornaCountNextLevelBackInformation();
        //voltar
        nestedViewsPage.clicaBotaoVoltar();
        String quintaMensagemRecebida = nestedViewsPage.retornaMsgTelaPrincipal();


        Assert.assertEquals(primeiraMensagemRecebida, primeiraMensagemEsperada);
        Assert.assertEquals(segundaMensagemRecebida, segundaMensagemEsperada);
        Assert.assertEquals(terceiraMensagemRecebida, terceiraMensagemEsperada);
        Assert.assertEquals(quartaMensagemRecebida, quartaMensagemEsperada);
        Assert.assertEquals(quintaMensagemRecebida, quintaMensagemEsperada);
    }

}
