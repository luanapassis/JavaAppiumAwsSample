package com.templateJavaAppium.pages.inputControls;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DataPickerPage extends PageBase {

    @AndroidFindBy(id = "android:id/date_picker_header_year")
    private MobileElement anoField;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and  @index='6']")
    private MobileElement ultimoAnodaListaField;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and  @index='1']")
    private MobileElement primeiroAnodaListaField;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_date_display")
    private MobileElement displayAnoField;

    public void clicaSelecaoAno()
    {
        click(anoField);
    }

    public void retornaValorAnoMaior1994(String anoDesejado)
    {
        String anoRetornado = getText(ultimoAnodaListaField);
        do {
            scrollUsingPressTouchActions(530, 950, 530, 777);
            anoRetornado = getText(ultimoAnodaListaField);
        }while (!anoRetornado.contains(anoDesejado));
        click(ultimoAnodaListaField);
    }

    public void retornaValorAnoMenor1994(String anoDesejado)
    {
        String anoRetornado = getText(ultimoAnodaListaField);
        do {
            scrollUsingPressTouchActions(530, 950, 530, 1123);
            anoRetornado = getText(ultimoAnodaListaField);
        }while (!anoRetornado.contains(anoDesejado));
        click(ultimoAnodaListaField);
    }

    public String retornaAnoDoDisplay()
    {
        return getText(displayAnoField);
    }

}
