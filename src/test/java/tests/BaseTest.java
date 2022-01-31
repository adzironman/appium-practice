package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

  public static void main(String[] args) throws MalformedURLException {
    File appDir = new File("src/test/resources/apps");
    File app = new File(appDir, "ApiDemos-debug.apk");
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability(MobileCapabilityType.DEVICE_NAME, "AppiumTraining");
    caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");


    AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
  }


}
