package com.templateJavaAppium.pages.inputControls;

import com.templateJavaAppium.bases.PageBase;
import com.templateJavaAppium.bases.ReadToastMessage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.sourceforge.tess4j.TesseractException;

public class SubmitButtonPage extends PageBase {

    ReadToastMessage readToastMessage;

    //submit button
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_submit_button")
    private MobileElement submitButton;

    public String clicaSubmit() throws TesseractException {
        readToastMessage = new ReadToastMessage();
        submitButton.click();
        String result = readToastMessage.readToastMessage();
        return result;
    }
}
