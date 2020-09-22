package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class HomePage extends PageBase {

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='ReferenceApp']")
    private MobileElement menu;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc='Row Category Name'])[1]")
    private MobileElement homeMenu;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc='Row Category Name'])[8]")
    private MobileElement loginMenu;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/homepage_headline")
    private MobileElement textoPrincipalHomeField;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/homepage_subheadline")
    private MobileElement versaoHomeField;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc='Row Category Name'])[4]")
    private MobileElement inputControlsMenu;


    public void clicaMenuPrincipal() {
        click(menu);
    }
    public void clicaMenuHome()
    {
        click(homeMenu);
    }
    public void clicaMenuLogin()
    {
        click(loginMenu);
    }

    public String retornaTextoPrincipalHome() {
        return getText(textoPrincipalHomeField);
    }

    public String retornaTextoVersaoHome()
    {
        return getText(versaoHomeField);
    }
    public void clicaMenuInputControls()
    {
        click(inputControlsMenu);
    }
}
