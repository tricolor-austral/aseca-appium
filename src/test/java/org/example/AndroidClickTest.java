package org.example;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class AndroidClickTest extends BaseAndroidTest{
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver driver = BaseAndroidTest.desiredCapabilities();
        Thread.sleep(1000);

        MobileElement createTab = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Create']");
        createTab.click();

        MobileElement stockTab = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Stock']");
        MobileElement ordersTab = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Orders']");

        // Wait for the "Create Product" screen to load
        Thread.sleep(2000);

        // Find input fields and fill them
        MobileElement nameField = (MobileElement) driver.findElementByXPath("//android.widget.EditText[@text='Enter Name']");
        nameField.sendKeys("Sample Product");

        MobileElement priceField = (MobileElement) driver.findElementByXPath("//android.widget.EditText[@text='Enter Price']");
        priceField.sendKeys("100");

        MobileElement quantityField = (MobileElement) driver.findElementByXPath("//android.widget.EditText[@text='Enter Quantity']");
        quantityField.sendKeys("10");

        MobileElement supplierField = (MobileElement) driver.findElementByXPath("//android.widget.EditText[@text='Enter Supplier name']");
        supplierField.sendKeys("Sample Supplier");

        MobileElement createButton = (MobileElement) driver.findElementByXPath("//android.widget.TextView[contains(@text, 'Create')]");
        createButton.click();

        stockTab.click();
        ordersTab.click();

    }
}
