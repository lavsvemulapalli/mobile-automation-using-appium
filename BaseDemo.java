import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.io.Files;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseDemo {

	public static  AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		
		
		File f=new File("src");
		File fs=new File(f,"ApiDemos-debug.apk");
		
		
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
		dc.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		return driver;
		
	
}

}
