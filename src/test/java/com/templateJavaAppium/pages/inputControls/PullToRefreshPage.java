package com.templateJavaAppium.pages.inputControls;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PullToRefreshPage extends PageBase {

    //pull to refresh
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_refresh_display")
    private MobileElement horaAposRefreshField;

    public void swipeToRefresh()
    {
        scrollUsingTouchActions(500, 500, 500, 1700, 2);
    }
    public String retornaHoraAposRefresh()
    {
        return getText(horaAposRefreshField);
    }


}
