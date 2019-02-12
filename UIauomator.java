import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIauomator extends BaseDemo {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capabilities();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();
		// validate click features for all options
		
		
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(false)").size());
	System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().enabled(false)").size());
	
		
		
		
		
	}

}
