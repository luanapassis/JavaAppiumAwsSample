package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import com.templateJavaAppium.bases.ReadToastMessage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.sourceforge.tess4j.TesseractException;

public class AlertsPage extends PageBase {

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/notifications_toast_button")
    private MobileElement toastButton;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/notifications_alert_button")
    private MobileElement alertButton;

    @AndroidFindBy(id = "android:id/message")
    private MobileElement messagemAlertFild;

    @AndroidFindBy(id = "android:id/button1")
    private MobileElement okAlertButton;

    public void clicaAlertButton(){click(alertButton);}
    public String retornaMsgAlerta(){return getText(messagemAlertFild);}
    public void clicaOkButton(){click(okAlertButton);}

    public String clicaToastButton() throws TesseractException {
        ReadToastMessage readToastMessage = new ReadToastMessage();
        click(toastButton);
        String result = readToastMessage.readToastMessage();
        return result;
    }

}
