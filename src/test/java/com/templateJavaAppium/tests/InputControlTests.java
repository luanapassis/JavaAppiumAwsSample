package com.templateJavaAppium.tests;

import com.templateJavaAppium.bases.ReadToastMessage;
import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomePage;
import com.templateJavaAppium.pages.inputControls.*;
import com.templateJavaAppium.utils.ReadExcelFile;
import net.sourceforge.tess4j.TesseractException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sun.security.provider.ConfigFile;

public class InputControlTests extends TestBase {

    HomePage homePage;
    InputControlSwipeMenuPage inputControlSwipeMenuPage;
    TextFieldPage textFieldPage;
    CheckBoxPage checkBoxPage;
    RadionButtonsPage radionButtonsPage;
    ToggleButtonPage toggleButtonPage;
    SpinnerPage spinnerPage;
    PullToRefreshPage pullToRefreshPage;
    TimePickerPage timePickerPage;
    SubmitButtonPage submitButtonPage;
    ReadToastMessage readToastMessage;

    private static int menuTexField =0;
    private static int menuCheckBox =1;
    private static int menuRadioButtons =2;
    private static int menuToggleButton =3;
    private static int menuSpinner =4;
    private static int menuPullToRefresh =5;
    private static int menuTimePicker =6;
    private static int menuDataPicker =7;
    private static int menuSubmitButton =8;
    private static int menuGestures =9;

    //menu texfield
    @Test
    public void verificaInteracaoTextField() {

        homePage = new HomePage();
        inputControlSwipeMenuPage = new InputControlSwipeMenuPage();
        textFieldPage = new TextFieldPage();

        String textoDigitado = "Testing the application";

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuInputControls();
        textFieldPage.peencheTextField(textoDigitado);
        String textoRetornado = textFieldPage.retornaTextoDigitadoNoTextField();

        Assert.assertEquals(textoDigitado, textoRetornado);
    }
    //Menu checkBox
    @Test
    public void verificaInteracaoCheckBox() {

        homePage = new HomePage();
        inputControlSwipeMenuPage = new InputControlSwipeMenuPage();
        checkBoxPage = new CheckBoxPage();

        String statusEsperadoAntes = "Unchecked";
        String statusEsperadoDepois = "Checked";

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuInputControls();
        inputControlSwipeMenuPage.swipe(menuCheckBox);
        String checkStatusAntes = checkBoxPage.retornaStatusCheckBox();
        checkBoxPage.selecionaCheckBox();
        String checkStatusDepois = checkBoxPage.retornaStatusCheckBox();

        Assert.assertEquals(checkStatusAntes, statusEsperadoAntes);
        Assert.assertEquals(checkStatusDepois, statusEsperadoDepois);
    }
    //Menu Radio Button
    @Test
    public  void verificaSelecaoRadioButtonAmazon()
    {
        homePage = new HomePage();
        inputControlSwipeMenuPage = new InputControlSwipeMenuPage();
        radionButtonsPage = new RadionButtonsPage();

        String textoEsperado= "Amazon";

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuInputControls();
        inputControlSwipeMenuPage.swipe(menuRadioButtons);
        radionButtonsPage.clicaRadioButtonAmazon();
        String textoRetornado = radionButtonsPage.retornaTextoResultadoRadioButton();

        Assert.assertEquals(textoRetornado, textoEsperado);
    }
    @Test
    public  void verificaSelecaoRadioButtonWeb()
    {
        homePage = new HomePage();
        inputControlSwipeMenuPage = new InputControlSwipeMenuPage();
        radionButtonsPage = new RadionButtonsPage();

        String textoEsperado= "Web";

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuInputControls();
        inputControlSwipeMenuPage.swipe(menuRadioButtons);
        radionButtonsPage.clicaRadioButtonWeb();
        String textoRetornado = radionButtonsPage.retornaTextoResultadoRadioButton();

        Assert.assertEquals(textoRetornado, textoEsperado);
    }
    @Test
    public  void verificaSelecaoRadioButtonServices()
    {
        homePage = new HomePage();
        inputControlSwipeMenuPage = new InputControlSwipeMenuPage();
        radionButtonsPage = new RadionButtonsPage();

        String textoEsperado= "Services";

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuInputControls();
        inputControlSwipeMenuPage.swipe(menuRadioButtons);
        radionButtonsPage.clicaRadioButtonServices();
        String textoRetornado = radionButtonsPage.retornaTextoResultadoRadioButton();

        Assert.assertEquals(textoRetornado, textoEsperado);
    }
    //Menu ToggleButton
    @Test
    public  void verificaToggleButton()
    {
        homePage = new HomePage();
        inputControlSwipeMenuPage = new InputControlSwipeMenuPage();
        toggleButtonPage = new ToggleButtonPage();

        String textoEsperadoAntes = "OFF";
        String textoEsperadoDepois = "ON";

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuInputControls();
        inputControlSwipeMenuPage.swipe(menuToggleButton);
        String textoRetornadoAntes = toggleButtonPage.retornaToggleState();
        toggleButtonPage.clicaToggleButton();
        String textoRetornadoDepois = toggleButtonPage.retornaToggleState();

        Assert.assertEquals(textoRetornadoAntes, textoEsperadoAntes);
        Assert.assertEquals(textoRetornadoDepois, textoEsperadoDepois);
    }
    //Menu spinner
    @Test(dataProvider="testdata")
    public  void selecionaOpcaospinner(String opcao, String resultadoEsperado) throws InterruptedException
    {
        homePage = new HomePage();
        inputControlSwipeMenuPage = new InputControlSwipeMenuPage();
        spinnerPage = new SpinnerPage();

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuInputControls();
        inputControlSwipeMenuPage.swipe(menuSpinner);
        spinnerPage.selecionaOpcao(opcao);
        String opcaoRetornada = spinnerPage.retornaOpcaoSelecionada();

        Assert.assertEquals(opcaoRetornada, resultadoEsperado);
    }
    //Menu pull to refresh
    @Test
    public  void verificaHoraAposRefresh()
    {
        homePage = new HomePage();
        inputControlSwipeMenuPage = new InputControlSwipeMenuPage();
        pullToRefreshPage = new PullToRefreshPage();

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuInputControls();
        inputControlSwipeMenuPage.swipe(menuPullToRefresh);
        pullToRefreshPage.swipeToRefresh();
        String horaAposRefresh = pullToRefreshPage.retornaHoraAposRefresh();

        Assert.assertNotNull(horaAposRefresh);
    }

    //menu Time Picker
    @Test
    public  void verificaSelecaoDeHoraAM()
    {
        homePage = new HomePage();
        inputControlSwipeMenuPage = new InputControlSwipeMenuPage();
        timePickerPage = new TimePickerPage();

        String horaEsperada = "0 : 00";

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuInputControls();
        inputControlSwipeMenuPage.swipe(menuTimePicker);
        timePickerPage.selecionaAm();
        timePickerPage.clicarIconeTelcado();
        timePickerPage.digitaHoras("12");
        timePickerPage.digitaMinutos("00");
        String horaRetornada = timePickerPage.retornaHoraDiplay();

       Assert.assertEquals(horaRetornada, horaEsperada);
    }
    @Test
    public  void verificaSelecaoDeHoraPM()
    {
        homePage = new HomePage();
        inputControlSwipeMenuPage = new InputControlSwipeMenuPage();
        timePickerPage = new TimePickerPage();

        String horaEsperada = "12 : 00";

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuInputControls();
        inputControlSwipeMenuPage.swipe(menuTimePicker);
        timePickerPage.selecionaPm();
        timePickerPage.clicarIconeTelcado();
        timePickerPage.digitaHoras("12");
        timePickerPage.digitaMinutos("00");
        String horaRetornada = timePickerPage.retornaHoraDiplay();

        Assert.assertEquals(horaRetornada, horaEsperada);
    }
//readToastMessage
@Test
public  void testeToast() throws TesseractException {

    homePage = new HomePage();
    inputControlSwipeMenuPage = new InputControlSwipeMenuPage();
    submitButtonPage = new SubmitButtonPage();
    readToastMessage = new ReadToastMessage();

    readToastMessage.tst();

    homePage.clicaMenuPrincipal();
    homePage.clicaMenuInputControls();
    inputControlSwipeMenuPage.swipe(menuSubmitButton);
    String resultado = submitButtonPage.clicaSubmit();
    Assert.assertNotNull(resultado);
}



    @DataProvider(name="testdata")
    public Object[][] testDataExample()
    {

        ReadExcelFile configuration = new ReadExcelFile("C:\\Users\\Base2\\Desktop\\Ole\\Template Apium\\javaappiumtemplate-master\\src\\test\\resources\\testdata.xlsx");
        int rows = configuration.getRowCount(0);

        //2 é a quantidade de valores que será preenchido no for
        Object[][]signin_credentials = new Object[rows][2];

        for(int i=0;i<rows;i++)
        {
            signin_credentials[i][0] = configuration.getData(0, i, 0);
            signin_credentials[i][1] = configuration.getData(0, i, 1);
        }
        return signin_credentials;
    }



}
