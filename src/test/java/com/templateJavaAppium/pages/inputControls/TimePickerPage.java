package com.templateJavaAppium.pages.inputControls;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TimePickerPage extends PageBase {

    //timer picker
    @AndroidFindBy(id = "android:id/toggle_mode")
    private MobileElement keyboardIcon;

    @AndroidFindBy(id = "android:id/input_hour")
    private MobileElement horasField;

    @AndroidFindBy(id = "android:id/input_minute")
    private MobileElement minutosFiled;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_time_display")
    private MobileElement horaDisplayField;

    @AndroidFindBy(id = "android:id/am_label")
    private MobileElement amField;

    @AndroidFindBy(id = "android:id/pm_label")
    private MobileElement pmField;

    @AndroidFindBy(xpath = "//*[@content-desc='12']")
    private MobileElement dozeHorasRelogioField;

    @AndroidFindBy(xpath = "//*[@content-desc='0']")
    private MobileElement zeroMinutosRelogioField;


    public void clicarIconeTelcado()
    {
        click(keyboardIcon);
    }

    public void digitaHoras(String hora)
    {
        clearAndSendKeys(horasField, hora);
        hideKeyboard();
    }
    public void digitaMinutos(String minuto)
    {
        clearAndSendKeys(minutosFiled, minuto);
        hideKeyboard();
    }
    public void selecionaAm()
    {
        click(amField);
    }
    public void selecionaPm()
    {
        click(pmField);
    }

    public void seleciona12HorasRelogio()
    {
        click(dozeHorasRelogioField);
    }
    public void seleciona00MinutosRelogio()
    {
        waitLoadingScreen(zeroMinutosRelogioField);
        click(zeroMinutosRelogioField);
    }
    public String retornaHoraDiplay()
    {
        return getText(horaDisplayField);
    }




}
