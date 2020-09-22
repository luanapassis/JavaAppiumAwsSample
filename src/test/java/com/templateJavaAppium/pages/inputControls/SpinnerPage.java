package com.templateJavaAppium.pages.inputControls;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.ArrayList;

public class SpinnerPage extends PageBase {
    //spinner
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_spinner")
    private MobileElement spinner;

    @AndroidFindBy( className= "android.widget.TextView")
    private ArrayList<MobileElement> listaOpcoes;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_spinner_message")
    private MobileElement selectedOptionField;



    public void selecionaOpcao (String opcao)
    {
        click(spinner);
        clickElementList(listaOpcoes, opcao );
    }
    public String retornaOpcaoSelecionada()
    {
        return getText(selectedOptionField);
    }
}
