package com.templateJavaAppium.pages.inputControls;

import com.templateJavaAppium.bases.PageBase;

public class InputControlSwipeMenuPage extends PageBase {

    //By slider = (By.("com.amazonaws.devicefarm.android.referenceapp:id/input_checkbox_status"));
    public void swipe(int qtdMovimentos) {
        for (int i = 1; i <= qtdMovimentos; i++) {
            swipeToLeft();
        }
    }
}

