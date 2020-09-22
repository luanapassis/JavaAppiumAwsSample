package com.templateJavaAppium.pages;
import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;

public class LoginPage extends PageBase
{

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/username_text_input")
    private MobileElement usuarioField;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/password_text_input")
    private MobileElement senhaField;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/login_button")
    private MobileElement loginButton;

    @AndroidFindBy(id="com.amazonaws.devicefarm.android.referenceapp:id/login_alt_message_textView")
    private MobileElement loginFalhaMensagem;

    @AndroidFindBy(id="com.amazonaws.devicefarm.android.referenceapp:id/alt_button")
    private MobileElement tryAgainButton;


    public void preencheUsuario(String usuario)
    {
        sendKeys(usuarioField, usuario);
    }

    public void preencheSenha(String senha)
    {
        sendKeys(senhaField, senha);
    }

    public void clickEntrarButton()
    {
        click(loginButton);
    }

    public String retornaMensagemErroLogin(){ return getText(loginFalhaMensagem); }

    public void clicaTryAgain(){ click(tryAgainButton); }

    public boolean verificaExistenciaCampoUsuario()
    {
        return returnIfElementExists(usuarioField);
    }



}
