package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class HomePage extends PageBase {

    @AndroidFindBy(accessibility = "ReferenceApp")
    private MobileElement menu;

    @AndroidFindBy(xpath = "(//*[@content-desc='Row Category Name'])[1]")
    private MobileElement homeMenu;

    @AndroidFindBy(xpath = "(//*[@content-desc='Row Category Name'])[4]")
    private MobileElement inputControlsMenu;

    @AndroidFindBy(xpath = "(//*[@content-desc='Row Category Name'])[5]")
    private MobileElement nestedViewsMenu;

    @AndroidFindBy(xpath = "(//*[@content-desc='Row Category Name'])[7]")
    private MobileElement alertsMenu;

    @AndroidFindBy(xpath = "(//*[@content-desc='Row Category Name'])[8]")
    private MobileElement loginMenu;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/homepage_headline")
    private MobileElement textoPrincipalHomeField;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/homepage_subheadline")
    private MobileElement versaoHomeField;

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
    public void clicaMenuAlerts(){ click(alertsMenu);}
    public void clicaMenuNestedViews(){ click(nestedViewsMenu);}

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
