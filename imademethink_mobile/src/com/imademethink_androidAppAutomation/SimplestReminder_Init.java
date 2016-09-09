package com.imademethink_androidAppAutomation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class SimplestReminder_Init {

	public 		static AppiumDriver<AndroidElement> 	objAppiumDriver 		= null;
	private 	DesiredCapabilities 			objDesiredCapability			= null;
	private 	static String 					strAPPIUM_VERSION_USED 			= "1.2";
	private 	static String 					strPLATFORM_VERSION_USED		= "4.3";
	private 	static String 					strDEVICE_NAME_USED    			= "imademethink";
	
	// based on what android app to be tested APP_PACKAGE and APP_ACTIVITY will change.
	// it also depends on what device we are doing testing
	// this is retrieved using Activity Launcher app
	private 	static String 					str_APP_PACKAGE_USED    		= "com.gadgetjudge.simplestreminder";
	private 	static String 					str_APP_ACTIVITY_USED   		= "com.gadgetjudge.simplestreminder.NewReminderActivity";
//	private 	static String 					str_APP_ACTIVITY_USED   		= "in.smsoft.justremind.SettingsActivity";
//	private 	static String 					str_APP_ACTIVITY_USED   		= "in.smsoft.justremind.lock.LockActivity";
//	private 	static String 					str_APP_WAIT_ACTIVITY_USED   	= "in.smsoft.justremind.lock.LockActivity";
	
//    File classpathRoot = new File(System.getProperty("user.dir"));
//    File appDir = new File(classpathRoot, "../../../apps/ContactManager");
//    File appFile = new File(appDir, "ContactManager.apk");

	private 	AppiumDriverLocalService 		objAppiumDriverLocalService		= null;
	private 	static String 					strNODE_JS_EXE_PATH 			= "E:\\aaaTool_MobileTesting_Selendroid\\APPIUM_INSTALLERS\\AppiumForWindows-1.2.0.0\\Appium\\node.exe";
	private 	static String 					strAPPIUM_JS_PATH 				= "E:\\aaaTool_MobileTesting_Selendroid\\APPIUM_INSTALLERS\\AppiumForWindows-1.2.0.0\\Appium\\node_modules\\appium\\bin\\appium.js";
	private 	static String 					strIP_ADDRESS__USED 			= "127.0.0.123";    // some random local IP address
	private 	static int 						intPORT_NUMBER 				  	= 4723;	            // generally 4723 is used but it can be changed
	private 	URL 							objURL							= null;
	public 		Boolean 						bAppLaunchedFlag				= false;
	private 	static int 						intAppLaunchWaitPeriod		  	= 25;				// seconds
	private  	boolean 						boolStopFurtherSteps            = false;
	
	
	@AndroidFindBy(id			="com.gadgetjudge.simplestreminder:id/toolbar")
	private AndroidElement 		 id_SimplestReminder_HomeScreen_Toptoolbar;
	@AndroidFindBy(uiAutomator 	="new UiSelector().text(\"New Reminder\")")    /////////////////    important way to find element in page factory
	private AndroidElement 		 text_SimplestReminder_HomeScreen_Toptoolbar_title;
	@AndroidFindBy(className	="android.widget.ImageView")
	private List<AndroidElement> list_className_SimplestReminder_HomeScreen_Toptoolbar_Optionsimagerightside;

	public void Init_Default_Mobile_Capability(){
		objDesiredCapability = new DesiredCapabilities();
		objDesiredCapability.setCapability(MobileCapabilityType.PLATFORM, 			MobilePlatform.ANDROID);
		objDesiredCapability.setCapability(MobileCapabilityType.APPIUM_VERSION, 	strAPPIUM_VERSION_USED);
		objDesiredCapability.setCapability(MobileCapabilityType.PLATFORM_NAME, 		MobilePlatform.ANDROID);
		objDesiredCapability.setCapability(MobileCapabilityType.PLATFORM_VERSION, 	strPLATFORM_VERSION_USED);
		objDesiredCapability.setCapability(MobileCapabilityType.AUTOMATION_NAME, 	AutomationName.APPIUM);
		objDesiredCapability.setCapability(MobileCapabilityType.DEVICE_NAME, 		strDEVICE_NAME_USED);
		objDesiredCapability.setCapability(MobileCapabilityType.NO_RESET , 			false);
		objDesiredCapability.setCapability(MobileCapabilityType.FULL_RESET , 		false);
//		capabilities.setCapability("app", appFile.getAbsolutePath());
	}

	public void Init_Android_Mobile_Capability(){
		objDesiredCapability.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,  str_APP_PACKAGE_USED);
		objDesiredCapability.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, str_APP_ACTIVITY_USED);
//		capabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, str_APP_WAIT_ACTIVITY_USED);
//		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "in.smsoft.justremind/.HomeActivity");
//		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
	}

	// separate method for appium service driver local service START
	private void start_appium_driver_local_service(){
		// init appium service builder programmatically
		objAppiumDriverLocalService = AppiumDriverLocalService.buildService(
														new AppiumServiceBuilder()
																.usingDriverExecutable(new File(strNODE_JS_EXE_PATH))
																.withAppiumJS(new File(strAPPIUM_JS_PATH))
																.withIPAddress(strIP_ADDRESS__USED)
																.usingPort(intPORT_NUMBER)
	    );

		// start appium programmatically
		objAppiumDriverLocalService.start();
	}
	
	// separate method for appium service driver local service STOP
	private void stop_appium_driver_local_service(){
		// stop appium service builder programmatically
		objAppiumDriverLocalService.stop();
	}
	
	private void init_page_objects_or_screen_objects(){
		// PageFactory.initElements(new AppiumFieldDecorator(objAppiumDriver, 5, TimeUnit.SECONDS), this);
	}
	
	public void User_Starts_App() throws MalformedURLException, InterruptedException{
		
		start_appium_driver_local_service();

		// start app
		objURL = new URL("http://" + strIP_ADDRESS__USED + ":"+ Integer.toString(intPORT_NUMBER) +"/wd/hub");
		try{
			objAppiumDriver 	= new AndroidDriver<AndroidElement>(objURL, objDesiredCapability);
		}catch(Exception e){
			bAppLaunchedFlag	= false;
			System.out.println("Exception generated.........................while starting app....... stopping appium driver local service");
			objAppiumDriverLocalService.stop();
			return;
		}

		// wait until app is launched successfully
		objAppiumDriver.manage().timeouts().implicitlyWait(intAppLaunchWaitPeriod, TimeUnit.SECONDS);

		// init different page objects 
		init_page_objects_or_screen_objects();
	}

	public void User_Stops_App(){
		// Thread.sleep(5000);
		objAppiumDriver.closeApp();
		stop_appium_driver_local_service();
	}
	
	public void tapOn(AndroidElement localAndroidElement){
	     // new TouchAction((MobileDriver) getDriver()).tap(localAndroidElement).perform();
		 new TouchAction(objAppiumDriver).tap(localAndroidElement).perform();
	}
	
	
	public void Home_Screen_Element_ToBe_Shown() throws InterruptedException{
//		PageFactory.initElements(new AppiumFieldDecorator(objAppiumDriver, 5, TimeUnit.SECONDS), this);
		
		if (    objAppiumDriver.findElementById("com.gadgetjudge.simplestreminder:id/toolbar").isDisplayed() &&  // top toolbar
				objAppiumDriver.findElementByName("New Reminder").isDisplayed() &&                               // New Reminder text
			   (objAppiumDriver.findElementsByClassName("android.widget.ImageView").size() > 0)                  // Right side options image
			){
//			System.out.println("\n\n\n===\n\n\n");
//			id_SimplestReminder_HomeScreen_Toptoolbar.isDisplayed();
//			text_SimplestReminder_HomeScreen_Toptoolbar_title.isDisplayed();
//			list_className_SimplestReminder_HomeScreen_Toptoolbar_Optionsimagerightside.size();
			System.out.println("DEBUG :: Required home screen elements are shown");
			objAppiumDriver.findElementsByClassName("android.widget.ImageView").get(0).click();
			((AndroidDriver<AndroidElement>) objAppiumDriver).pressKeyCode(AndroidKeyCode.BACK);
			//objAppiumDriver.findElementByName("Help").sendKeys(Keys.ENTER);
		}else{
			System.out.println("ERROR :: Required home screen elements are NOT shown. This test to be discontinued.");
			boolStopFurtherSteps = true;
		}
		
		
//		if (    id_SimplestReminder_HomeScreen_Toptoolbar.isDisplayed() &&
//				text_SimplestReminder_HomeScreen_Toptoolbar_title.isDisplayed() &&
//			   (list_className_SimplestReminder_HomeScreen_Toptoolbar_Optionsimagerightside.size() > 0)
//			){
//			System.out.println("Debug :: Required home screen element is shown");
//			list_className_SimplestReminder_HomeScreen_Toptoolbar_Optionsimagerightside.get(0).click();
//		}

		objAppiumDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void User_adds_reminder_with_default_setting(){
		if(boolStopFurtherSteps){
			System.out.println("ERROR :: Earlier dependent step failed. So this step is not executed."); return;}

		objAppiumDriver.findElementByName("Remind me…").sendKeys("dummy reminder");                                     // reminder name
		objAppiumDriver.findElementById("com.gadgetjudge.simplestreminder:id/editTextDate").click(); 					// click on date selector
		objAppiumDriver.findElementsByClassName("android.widget.Button").get(5).click();								// click on tomorrows date
		objAppiumDriver.findElementByName("Set").click();                                                               // confirm by clicking on Set
		objAppiumDriver.findElementById("com.gadgetjudge.simplestreminder:id/buttonCreateReminder").click(); 			// click to save reminder
		// check if add reminder icon (+ sign) is shown
		if(objAppiumDriver.findElementById("com.gadgetjudge.simplestreminder:id/reminderTitle").isDisplayed()){
			System.out.println("DEBUG :: Reminder added successfully.");
		}else{
			System.out.println("ERROR :: Reminder not added successfully. This test to be discontinued.");
			boolStopFurtherSteps = true;
		}
	}
	
	public void Same_reminder_should_be_shown_in_list(){
		if(boolStopFurtherSteps){
			System.out.println("ERROR :: Earlier dependent step failed. So this step is not executed."); return;}

		// check if reminder with same name is added in reminder list
		if(objAppiumDriver.findElementById("com.gadgetjudge.simplestreminder:id/reminderTitle").getText().contains("dummy reminder") ){
			System.out.println("DEBUG :: Reminder added cross check is successful.");
		}else{
			System.out.println("ERROR :: Reminder added cross check is NOT successful. This test to be discontinued.");
			boolStopFurtherSteps = true;
		}
	}
	
	public void User_edits_user_edits_already_added_reminder_by_changing_text(){
		if(boolStopFurtherSteps){
			System.out.println("ERROR :: Earlier dependent step failed. So this step is not executed."); return;}
		
		// click on view list of reminders icon
		objAppiumDriver.findElementById("com.gadgetjudge.simplestreminder:id/buttonListReminders").click();
		objAppiumDriver.findElementById("com.gadgetjudge.simplestreminder:id/reminderTitle").click();
		objAppiumDriver.findElementByName("Edit").click();
		objAppiumDriver.findElementById("com.gadgetjudge.simplestreminder:id/editTextNewReminderTitle").clear();
		objAppiumDriver.findElementById("com.gadgetjudge.simplestreminder:id/editTextNewReminderTitle").sendKeys("dummy reminder new");
		objAppiumDriver.findElementById("com.gadgetjudge.simplestreminder:id/buttonCreateReminder").click();
		// check if add reminder icon (+ sign) is shown
		if(objAppiumDriver.findElementById("com.gadgetjudge.simplestreminder:id/reminderTitle").isDisplayed()){
			System.out.println("DEBUG :: Reminder added successfully.");
		}else{
			System.out.println("ERROR :: Reminder not added successfully. This test to be discontinued.");
			boolStopFurtherSteps = true;
		}		
	}
	
	public void Edited_reminder_should_be_shown_in_list(){
		if(boolStopFurtherSteps){
			System.out.println("ERROR :: Earlier dependent step failed. So this step is not executed."); return;}

		// check if reminder with same name is added in reminder list
		if(objAppiumDriver.findElementById("com.gadgetjudge.simplestreminder:id/reminderTitle").getText().contains("dummy reminder new") ){
			System.out.println("DEBUG :: Reminder added cross check is successful.");
		}else{
			System.out.println("ERROR :: Reminder added cross check is NOT successful. This test to be discontinued.");
			boolStopFurtherSteps = true;
		}
	}
	
	public void User_deletes_already_added_reminder(){
		if(boolStopFurtherSteps){
			System.out.println("ERROR :: Earlier dependent step failed. So this step is not executed."); return;}
		
		// click on view list of reminders icon
		objAppiumDriver.findElementById("com.gadgetjudge.simplestreminder:id/buttonListReminders").click();
		objAppiumDriver.findElementById("com.gadgetjudge.simplestreminder:id/reminderTitle").click();
		objAppiumDriver.findElementByName("Delete").click();
		
		if (objAppiumDriver.findElementsById("com.gadgetjudge.simplestreminder:id/editTextNewReminderTitle").size() == 0){
			System.out.println("DEBUG :: Reminder deletion is successful.");
		}else{
			System.out.println("ERROR :: Reminder deletion is NOT successful. This test to be discontinued.");
			boolStopFurtherSteps = true;
		}
		
	}
	
	
	
	
	
	
}
