package tests;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.time.Duration;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class GesturesTest extends BaseTest {

  public static void main(String[] args) throws MalformedURLException {
    AndroidDriver<AndroidElement> driver = getAndroidDriver();

    driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
    //tap
    TouchAction t = new TouchAction(driver);
    WebElement expandList = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
    t.tap(tapOptions().withElement(element(expandList))).perform();
    driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
    WebElement pn = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");

    t.longPress(LongPressOptions.longPressOptions().withElement(element(pn)).withDuration(Duration.ofSeconds(2))).release().perform();
    System.out.println(driver.findElementById("android:id/title").isDisplayed());
  }
}
