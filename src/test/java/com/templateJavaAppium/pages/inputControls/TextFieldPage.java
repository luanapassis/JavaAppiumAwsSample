package com.templateJavaAppium.pages.inputControls;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TextFieldPage extends PageBase {
    //texfield
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_edit_text")
    private MobileElement textField;

    //text field actions
    public void peencheTextField(String texto)
    {
        sendKeys(textField, texto);
    }
    public String retornaTextoDigitadoNoTextField()
    {
        return getText(textField);
    }
}
