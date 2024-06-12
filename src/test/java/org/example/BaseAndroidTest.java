package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseAndroidTest {
    public static AndroidDriver desiredCapabilities() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);

        capabilities.setCapability("commandTimeouts", "12000");
        capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Benja\\projects\\aseca\\appium\\src\\test\\java\\org\\example\\android\\application-1a2992c6-3bd6-41c6-9d09-d2ac68665214.apk");

        AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/"), capabilities);
        return driver;


    }
}
