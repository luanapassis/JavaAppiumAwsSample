package com.templateJavaAppium.pages.inputControls;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CheckBoxPage extends PageBase
{
    //checkbokx
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_checkbox")
    private MobileElement checkBox;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_checkbox_status")
    private MobileElement checkBoxStatus;

    //check box actions
    public void selecionaCheckBox()
    {
        click(checkBox);
    }
    //public boolean retornaSeElementoEstaSelecionado()
    // {
    //    return returnIfElementIsSelected(checkBox);
    // }
    public String retornaStatusCheckBox()
    {
        return getText(checkBoxStatus);
    }
}
