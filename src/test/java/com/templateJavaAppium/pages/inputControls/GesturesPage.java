package com.templateJavaAppium.pages.inputControls;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Coordinates;

public class GesturesPage extends PageBase {

    //salvar



    @AndroidFindBy(xpath = "//*[@content-desc=\"Gesture Action Pad\"]")
    private MobileElement gestureField;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_gesture_action_pad")
    private MobileElement gestureFieldContent;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_gesture_content")
    private MobileElement gestureDysplay;

    public void tapGestureField()
    {
        tap(gestureFieldContent);
    }
    public void doubleTapGestureField() {
        Coordinates points = gestureField.getCoordinates();
        doubleTapPress(points.onPage().getX(), points.onPage().getY());
    }
    public void longPressTapGestureField()
    {
        longPress(gestureFieldContent);
    }
    public void scrollingGestureField()
    {
        Coordinates points = gestureField.getCoordinates();
        scrollUsingTouchActions(points.onPage().getX(), points.onPage().getY(), points.onPage().getX()+10, points.onPage().getY()-100, 2 );
    }
    public String retornaValorDysplay()
    {
        return getText(gestureDysplay);
    }


}
