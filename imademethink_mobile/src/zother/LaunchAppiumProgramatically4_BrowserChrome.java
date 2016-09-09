package zother;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class LaunchAppiumProgramatically4_BrowserChrome {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		AppiumDriverLocalService service;
		service = AppiumDriverLocalService.buildService(
				new AppiumServiceBuilder()
						.usingDriverExecutable(new File("E:\\aaaTool_MobileTesting_Selendroid\\APPIUM_INSTALLERS\\AppiumForWindows-1.2.0.0\\Appium\\node.exe"))
						.withAppiumJS(new File("E:\\aaaTool_MobileTesting_Selendroid\\APPIUM_INSTALLERS\\AppiumForWindows-1.2.0.0\\Appium\\node_modules\\appium\\bin\\appium.js"))
						.withIPAddress("127.0.0.1")
						.usingPort(4723)
	    );
		service.start();
		WebDriver driver;
		//Set up desired capabilities and pass the Android app-activity and app-package to Appium
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.CHROME);
		capabilities.setCapability(MobileCapabilityType.PLATFORM, Platform.ANDROID); 
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "imademethink");
		capabilities.setCapability(MobileCapabilityType.VERSION, "4.3");
//		MobileCapabilityType.APP
//		E:\aaaTool_MobileTesting_Selendroid\Apps_Apk
		
		URL url123 = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<AndroidElement>(url123, capabilities);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://mail.cognizant.com");
		System.out.println(driver.getTitle());		
	   Thread.sleep(50000);		
	   driver.quit();
	   service.stop();
	}

}
