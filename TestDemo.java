import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestDemo extends BaseDemo {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver=capabilities();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.CheckBox[@index='0']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//android.widget.TextView[@text='WiFi settings']")).click();
	driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
	driver.findElement(By.xpath("//android.widget.EditText[@index='0']")).clear();;
		driver.findElement(By.xpath("//android.widget.EditText[@index='0']")).sendKeys("lavs");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		
		
	}

}
