import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
public class TapDemo extends BaseDemo {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capabilities();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		TouchAction t=new TouchAction(driver);
		t.tap(tapOptions().withElement(element(driver.findElement(By.xpath(("//android.widget.TextView[@text='Expandable Lists']")))))).perform();
		Thread.sleep(3000);
		t.tap(tapOptions().withElement(element(driver.findElement(By.xpath(("//android.widget.TextView[@text='1. Custom Adapter']")))))).perform();

	}

}
