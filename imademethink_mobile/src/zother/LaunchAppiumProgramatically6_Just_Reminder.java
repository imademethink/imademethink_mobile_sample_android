package zother;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class LaunchAppiumProgramatically6_Just_Reminder {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		AppiumDriverLocalService service=null;
		String IP_ADDRESS__USED = "127.0.0.2";
		service = AppiumDriverLocalService.buildService(
				new AppiumServiceBuilder()
						.usingDriverExecutable(new File("E:\\aaaTool_MobileTesting_Selendroid\\APPIUM_INSTALLERS\\AppiumForWindows-1.2.0.0\\Appium\\node.exe"))
						.withAppiumJS(new File("E:\\aaaTool_MobileTesting_Selendroid\\APPIUM_INSTALLERS\\AppiumForWindows-1.2.0.0\\Appium\\node_modules\\appium\\bin\\appium.js"))
						.withIPAddress(IP_ADDRESS__USED)
						.usingPort(4723)
	    );

		service.start();
		AppiumDriver<AndroidElement> driver = null;
//	    File classpathRoot = new File(System.getProperty("user.dir"));
//	    File appDir = new File(classpathRoot, "../../../apps/ContactManager");
//	    File appFile = new File(appDir, "ContactManager.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM, MobilePlatform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.2");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.3");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.APPIUM);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "imademethink");
		capabilities.setCapability(MobileCapabilityType.NO_RESET , false);
		capabilities.setCapability(MobileCapabilityType.FULL_RESET , false);
//		capabilities.setCapability("app", app.getAbsolutePath());

		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,  "in.smsoft.justremind");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "in.smsoft.justremind.SettingsActivity");
//		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "in.smsoft.justremind.lock.LockActivity");

		
//		capabilities.setCapability("appWaitActivity","in.smsoft.justremind.lock.LockActivity");
//		capabilities.setCapability("appActivity", "in.smsoft.justremind/.HomeActivity");
//		capabilities.setCapability("appWaitActivity", "com.android.calculator2.Calculator");


		
		URL url123 = new URL("http://" + IP_ADDRESS__USED + ":4723/wd/hub");
		try{
			driver = new AndroidDriver<AndroidElement>(url123, capabilities);
		}catch(Exception e){
			System.out.println("Exception generated.........................");
			service.stop();
			return;
		}
		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		List <AndroidElement> AlertElements = driver.findElementsByName("Alerts");
//		System.out.println("================>" + AlertElements.size());
		driver.findElementByName("Alerts").click();
		
		List <AndroidElement> titleElements = driver.findElements(By.id("android:id/title"));
		System.out.println("==========>" + titleElements.size());
		titleElements.get(3).click();
//		driver.findElement(By.className("android.widget.ImageButton")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
	  // Thread.sleep(5000);
	   driver.closeApp();
	   service.stop();
	}

}
