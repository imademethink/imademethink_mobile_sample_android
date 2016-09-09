package zother;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class LaunchAppiumProgramatically3 {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
//		AndroidDriver<MobileElement> driver;
//		DesiredCapabilities cap;
		
		AppiumDriverLocalService service;
		service = AppiumDriverLocalService.buildService(
				new AppiumServiceBuilder()
//						.usingDriverExecutable(new File("E:\\aaaTool_MobileTesting_Selendroid\\AppiumForWindows-1.1.0.0\\Appium\\node.exe"))
//						.withAppiumJS(new File("E:\\aaaTool_MobileTesting_Selendroid\\AppiumForWindows-1.1.0.0\\Appium\\node_modules\\appium\\bin\\appium.js"))
						.usingDriverExecutable(new File("E:\\aaaTool_MobileTesting_Selendroid\\APPIUM_INSTALLERS\\AppiumForWindows-1.2.0.0\\Appium\\node.exe"))
						.withAppiumJS(new File("E:\\aaaTool_MobileTesting_Selendroid\\APPIUM_INSTALLERS\\AppiumForWindows-1.2.0.0\\Appium\\node_modules\\appium\\bin\\appium.js"))
						.withIPAddress("127.0.0.1")
						.usingPort(4723)
	    );
				
		service.start();
		
		
		WebDriver driver;
		//Set up desired capabilities and pass the Android app-activity and app-package to Appium
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "4.4.2"); 
		capabilities.setCapability("deviceName","Emulator");
		capabilities.setCapability("platformName","Android");
		
		capabilities.setCapability("appPackage", "com.android.calculator2");
		// This package name of your app (you can get it from apk info app)
		capabilities.setCapability("appActivity","com.android.calculator2.Calculator"); // This is Launcher activity of your app (you can get it from apk info app)
		//Create RemoteWebDriver instance and connect to the Appium server
		//It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		   
		
	   //locate the Text on the calculator by using By.name()
	   WebElement two=driver.findElement(By.name("2"));
	   two.click();
	   WebElement plus=driver.findElement(By.name("+"));
	   plus.click();
	   WebElement four=driver.findElement(By.name("4"));
	   four.click();
	   WebElement equalTo=driver.findElement(By.name("="));
	   equalTo.click();
	   //locate the edit box of the calculator by using By.tagName()
	   WebElement results=driver.findElement(By.tagName("EditText"));
	   //Check the calculated value on the edit box
	   assert results.getText().equals("6"):"Actual value is : "+results.getText()+" did not match with expected value: 6";
		
	   Thread.sleep(50000);
		
	   driver.quit();
	   
	   service.stop();		

	}

}
