package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NestedViewsPage extends PageBase {

    //mensagem da tela principal
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/nested_textview")
    private MobileElement msgPrincipalField;

    //up navigation buttons
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/nested_up_button")
    private MobileElement upNavigationButton;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/nested_up_button")
    private MobileElement nextLeveUpNavigationlButton;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/up_navigation_content_text")
    private MobileElement upNavigationInformation;

    //back navigation buttons
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/nested_back_button")
    private MobileElement backNavigationButton;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/back_navigation_next_button")
    private MobileElement nextLevelBackNavigationButton;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/back_navigation_counter")
    private MobileElement countLevelBackNavigationInformation;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Navigate up\"]")
    private MobileElement goBackButton;


    //retorna msg tela principal
    public String retornaMsgTelaPrincipal()
    {
        waitLoadingScreen(msgPrincipalField);
        return getText(msgPrincipalField);
    }
    //up navigation actions
    public void clicaBotaoUpNavigation()
    {
        click(upNavigationButton);
    }
    public void clicaBotaoNextLeveUpNavigation()
    {
        click(nextLeveUpNavigationlButton);
    }
    public String retornaUpNavigationInformation() {
        waitLoadingScreen(upNavigationInformation);
        return getText(upNavigationInformation);
    }

    //back navigation actions
    public void clicaBotaoBackNavigation()
    {
        click(backNavigationButton);
    }
    public void clicaBotaoNextLevelBackNavigation()
    {
        click(nextLevelBackNavigationButton);
    }
    public String retornaCountNextLevelBackInformation()
    {
        waitLoadingScreen(countLevelBackNavigationInformation);
        return getText(countLevelBackNavigationInformation);
    }
    public void clicaBotaoVoltar()
    {
        click(goBackButton);
    }

}
