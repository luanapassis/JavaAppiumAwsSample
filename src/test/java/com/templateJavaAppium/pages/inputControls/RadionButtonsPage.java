package com.templateJavaAppium.pages.inputControls;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RadionButtonsPage extends PageBase {
    //RadioButton
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/radio_button_1")
    private MobileElement amazonRadioButton;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/radio_button_2")
    private MobileElement webRadioButton;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/radio_button_3")
    private MobileElement servicesRadioButton;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_radio_button_display")
    private MobileElement radioButtonResultField;

    //radioButton
    public void clicaRadioButtonAmazon()
    {
        click(amazonRadioButton);
    }
    public void clicaRadioButtonWeb()
    {
        click(webRadioButton);
    }
    public void clicaRadioButtonServices()
    {
        click(servicesRadioButton);
    }
    public String retornaTextoResultadoRadioButton()
    {
        return getText(radioButtonResultField);
    }


}
