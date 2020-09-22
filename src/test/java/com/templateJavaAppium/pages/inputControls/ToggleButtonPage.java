package com.templateJavaAppium.pages.inputControls;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ToggleButtonPage extends PageBase {

    //Toggle Button
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_switch")
    private MobileElement toggleButton;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_switch_display")
    private MobileElement imgDisplay;
    //toggle button
    public void clicaToggleButton()
    {
        click(toggleButton);
    }
    public String retornaToggleState()
    {
        return getContentDescription(imgDisplay);
    }
}
