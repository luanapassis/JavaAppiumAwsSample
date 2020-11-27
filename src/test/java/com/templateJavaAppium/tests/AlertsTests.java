package com.templateJavaAppium.tests;

import com.templateJavaAppium.bases.ReadToastMessage;
import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.AlertsPage;
import com.templateJavaAppium.pages.HomePage;
import net.sourceforge.tess4j.TesseractException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase {

    HomePage homePage;
    AlertsPage alertsPage;

    @Test
    public void verificaMensagemAlerta()
    {
        homePage = new HomePage();
        alertsPage = new AlertsPage();

        String msgEsperada = "This is the alert message";

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuAlerts();
        alertsPage.clicaAlertButton();
        String msgRetornada = alertsPage.retornaMsgAlerta();
        alertsPage.clicaOkButton();

        Assert.assertEquals(msgRetornada, msgEsperada);
    }
@Test
    public void verificaToastMessage() throws TesseractException {
        homePage = new HomePage();
        alertsPage = new AlertsPage();

        ReadToastMessage rdm = new ReadToastMessage();

        String msgEsperada = "Toast";

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuAlerts();
        String msgRetornada = alertsPage.clicaToastButton();

        Assert.assertEquals(msgRetornada, msgEsperada);
    }
}
