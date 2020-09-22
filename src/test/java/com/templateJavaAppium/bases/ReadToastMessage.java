package com.templateJavaAppium.bases;

import com.templateJavaAppium.utils.ExtentReportUtils;
import net.sourceforge.tess4j.ITessAPI;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.util.LoadLibs;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.bytedeco.javacpp.*;
import static org.bytedeco.javacpp.lept.*;
import static org.bytedeco.javacpp.tesseract.*;

import io.appium.java_client.android.AndroidDriver;

public class ReadToastMessage extends PageBase {

    public String readToastMessage() throws TesseractException {
        String scrShotDir = "screenshots";
        File scrShotDirPath = new java.io.File("./"+ scrShotDir+ "//");

        String imgName = takeScreenShot();
        String result = null;
        File imageFile = new File(scrShotDirPath, imgName);
        ITesseract instance = new Tesseract();

        File tessDataFolder = LoadLibs.extractTessResources("tessdata");
        instance.setDatapath(tessDataFolder.getAbsolutePath());
        result = instance.doOCR(imageFile);
        return result;
    }

    public void tst()
    {
        BytePointer outText;

        TessBaseAPI api = new TessBaseAPI();
        // Initialize tesseract-ocr with English, without specifying tessdata path
        if (api.Init(null, "eng") != 0) {
            System.err.println("Could not initialize tesseract.");
            System.exit(1);
        }

        // Open input image with leptonica library
        PIX image = pixRead("C:\\Users\\Base2\\Desktop\\Ole\\Template Apium\\javaappiumtemplate-master\\screenshots\\04-Aug-2020__08_54_46PM.png");
        api.SetImage(image);
        // Get OCR result
        outText = api.GetUTF8Text();
        System.out.println("OCR output:\n" + outText.getString());

        // Destroy used object and release memory
        api.End();
        outText.deallocate();
        pixDestroy(image);
    }

}