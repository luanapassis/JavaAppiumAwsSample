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

    //region Declarações
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
    GesturesPage gesturesPage;
    DataPickerPage dataPickerPage;
    //endregion
    //region atribuições a valores dos menus
    private static String menuTexField ="Text Field";
    private static String menuCheckBox ="Checkbox";
    private static String menuRadioButtons ="Radio Buttons";
    private static String menuToggleButton ="Toggle Button";
    private static String menuSpinner ="Spinner";
    private static String menuPullToRefresh ="Pull To Refresh";
    private static String menuTimePicker ="Time Picker";
    private static String menuDataPicker ="Date Picker";
    private static String menuSubmitButton ="Submit Button";
    private static String menuGestures ="Gestures";
    //endregion

    //Casos de Testes

    //region Menu Text Field
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
    //endregion
    //region Menu checkBox
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
    //endregion
    //region Menu Radio Button
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
    //endregion
    //region Menu ToggleButton
    @Test
    public  void verificaToggleButtonOff()
    {
        homePage = new HomePage();
        inputControlSwipeMenuPage = new InputControlSwipeMenuPage();
        toggleButtonPage = new ToggleButtonPage();

        String textoEsperado = "OFF";

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuInputControls();
        inputControlSwipeMenuPage.swipe(menuToggleButton);
        String textoRetornado = toggleButtonPage.retornaToggleState();

        Assert.assertEquals(textoRetornado, textoEsperado);
    }
    @Test
    public  void verificaToggleButtonOn()
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
    //endregion
    //region Menu spinner
    @Test(dataProvider="testdata")
    public  void selecionaOpcaospinnerDataDriven(String opcao, String resultadoEsperado) throws InterruptedException
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
    //endregion
    //region Menu Pull to Refresh
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
    //endregion
    //region menu Time Picker
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
        //timePickerPage.clicarIconeTelcado();
        //timePickerPage.digitaHoras("12");
        //timePickerPage.digitaMinutos("00");
        timePickerPage.seleciona12HorasRelogio();
        timePickerPage.seleciona00MinutosRelogio();
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
        //timePickerPage.clicarIconeTelcado();
        //timePickerPage.digitaHoras("12");
        //timePickerPage.digitaMinutos("00");
        timePickerPage.seleciona12HorasRelogio();
        timePickerPage.seleciona00MinutosRelogio();
        String horaRetornada = timePickerPage.retornaHoraDiplay();

        Assert.assertEquals(horaRetornada, horaEsperada);
    }
    //endregion
    //region Menu Submit Button
    @Test
    public  void verificaToastMessage() throws TesseractException {

        homePage = new HomePage();
        inputControlSwipeMenuPage = new InputControlSwipeMenuPage();
        submitButtonPage = new SubmitButtonPage();
        readToastMessage = new ReadToastMessage();

        String mensagemEsperada = "Subimitted";

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuInputControls();
        inputControlSwipeMenuPage.swipe(menuSubmitButton);
        //resultado possui o valor obtido no OCR da tela
        String resultado = submitButtonPage.clicaSubmit();
        Assert.assertTrue(resultado.contains(mensagemEsperada));
    }
    //endregion
    //region Menu Gesture
    @Test
    public  void verificaGesturesOneTap()
    {
        homePage = new HomePage();
        inputControlSwipeMenuPage = new InputControlSwipeMenuPage();
        gesturesPage = new GesturesPage();

        String gestureEperado1 = "Single Tap Up";
        String gestureEperado2 = "Single tap confirmed";

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuInputControls();
        inputControlSwipeMenuPage.swipe(menuGestures);
        gesturesPage.tapGestureField();
        String valorRetornado = gesturesPage.retornaValorDysplay();

        Assert.assertTrue(valorRetornado.contains(gestureEperado1));
        Assert.assertTrue(valorRetornado.contains(gestureEperado2));
    }
    @Test
    public  void verificaGestureLongPress()
    {
        homePage = new HomePage();
        inputControlSwipeMenuPage = new InputControlSwipeMenuPage();
        gesturesPage = new GesturesPage();

        String gestureEperado1 = "Long Press";

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuInputControls();
        inputControlSwipeMenuPage.swipe(menuGestures);
        gesturesPage.longPressTapGestureField();
        String valorRetornado = gesturesPage.retornaValorDysplay();

        Assert.assertTrue(valorRetornado.contains(gestureEperado1));
    }

    @Test
    public  void verificaGestureDoubleTab()
    {
        homePage = new HomePage();
        inputControlSwipeMenuPage = new InputControlSwipeMenuPage();
        gesturesPage = new GesturesPage();

        String gestureEperado1 = "Event within double tap";

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuInputControls();
        inputControlSwipeMenuPage.swipe(menuGestures);
        gesturesPage.doubleTapGestureField();
        String valorRetornado = gesturesPage.retornaValorDysplay();

        Assert.assertTrue(valorRetornado.contains(gestureEperado1));
    }

    @Test
    public  void verificaGestureScrolling()
    {
        homePage = new HomePage();
        inputControlSwipeMenuPage = new InputControlSwipeMenuPage();
        gesturesPage = new GesturesPage();

        String gestureEperado1 = "Scroll";

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuInputControls();
        inputControlSwipeMenuPage.swipe(menuGestures);
        gesturesPage.scrollingGestureField();
        String valorRetornado = gesturesPage.retornaValorDysplay();

        Assert.assertTrue(valorRetornado.contains(gestureEperado1));
    }
    //endregion
    //region Menu Data Picker
    @Test
    public void verificaDataPicker2005()
    {
        homePage = new HomePage();
        inputControlSwipeMenuPage = new InputControlSwipeMenuPage();
        dataPickerPage = new DataPickerPage();

        String anoDesejado = "2005";

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuInputControls();
        inputControlSwipeMenuPage.swipe(menuDataPicker);
        dataPickerPage.clicaSelecaoAno();
        dataPickerPage.retornaValorAnoMaior1994(anoDesejado);
        String anoSelecionado = dataPickerPage.retornaAnoDoDisplay();

        Assert.assertEquals(anoSelecionado , "7/5/2005");
    }
    @Test
    public void verificaDataPicker1985()
    {
        homePage = new HomePage();
        inputControlSwipeMenuPage = new InputControlSwipeMenuPage();
        dataPickerPage = new DataPickerPage();

        String anoDesejado = "1985";

        homePage.clicaMenuPrincipal();
        homePage.clicaMenuInputControls();
        inputControlSwipeMenuPage.swipe(menuDataPicker);
        dataPickerPage.clicaSelecaoAno();
        dataPickerPage.retornaValorAnoMenor1994(anoDesejado);
        String anoSelecionado = dataPickerPage.retornaAnoDoDisplay();

        Assert.assertEquals(anoSelecionado , "7/5/1985");
    }
    //endregion

    //region test data para data driven
    @DataProvider(name="testdata")
    public Object[][] testDataExample()
    {

        ReadExcelFile configuration = new ReadExcelFile(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata.xlsx");
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
    //endregion


}
