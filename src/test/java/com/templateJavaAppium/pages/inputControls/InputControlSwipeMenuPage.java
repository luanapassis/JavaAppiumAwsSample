package com.templateJavaAppium.pages.inputControls;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class InputControlSwipeMenuPage extends PageBase {

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView'][2]")
    private MobileElement itemCentralMenu;
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_checkbox")
    private MobileElement checkBoxButton;
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_edit_text")
    private MobileElement textField;

    public void swipeOld(int qtdMovimentos) {
        waitLoadingScreen(itemCentralMenu);
        for (int i = 1; i <= qtdMovimentos; i++) {
            swipeToLeft();
        }
    }
    public void swipe(String nomeMenuDesejado) {
        waitLoadingScreen(textField);
        String menuObtido;
        boolean checkBoxExiste;
        if (nomeMenuDesejado.equals("Checkbox"))
        {
            do {
                swipeToLeft();
                checkBoxExiste = returnIfElementExists(checkBoxButton);
            } while (!checkBoxExiste);
        }
        else {
            do {
                swipeToLeft();
                waitLoadingScreen(itemCentralMenu);
                //pega o texto do menu central
                menuObtido = getText(itemCentralMenu);
            } while (!menuObtido.equals(nomeMenuDesejado));
        }
    }
}

