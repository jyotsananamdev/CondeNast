package com.wired.automation;

import com.wired.automation.driver.AppiumSession;
import com.wired.automation.driver.impl.AndroidDriverProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class PreprocessorTest {
    public static WebDriver driver = null;
    private Properties prop;
    private final String propertyFilePath= "src/main/resources/Environment.properties";



    @Parameters({ "platformName" })
    @BeforeTest
    public void startUp(String platformName)
    {
        AppiumSession.startServer();
        //readConstants();
        if(platformName.equalsIgnoreCase("Android")) {
            driver = new AndroidDriverProvider().createAppiumDriver();
        }
        else if(platformName.equalsIgnoreCase("IOS")){
            driver = new AndroidDriverProvider().createAppiumDriver();
        }else {
            driver = new AndroidDriverProvider().createAppiumDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver.manage().window().maximize();
    }

    public static WebDriver getDriver()
    {
        return driver;
    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
        AppiumSession.stopServer();
    }

    public  void readConstants()
    {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            prop = new Properties();
            try {
                prop.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Environment.properties not found at " + propertyFilePath);
        }
    }
}
