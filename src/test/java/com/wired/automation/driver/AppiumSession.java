package com.wired.automation.driver;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class AppiumSession {

    public static  AppiumServiceBuilder builder;
    public static AppiumDriverLocalService service;
    public static void startServer() {

        //Build the Appium service
        builder = new AppiumServiceBuilder();
        builder.withIPAddress("127.0.0.1");
        builder.usingPort(4723);
        builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
        builder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");
        builder.usingDriverExecutable(new File("/usr/local/bin/node"));
        builder.withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"));
        //Start the server with the builder
        service = AppiumDriverLocalService.buildService(builder);
        service.start();
    }

    public static void stopServer() {
        service.stop();
    }

}
