package com.imademethink_androidAppAutomation;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefGeneral extends SimplestReminder_Init{
	
	@Given("^SimplestReminderApp User sets default mobile capability$")
	public void SimplestReminderApp_User_sets_default_mobile_capability() throws Throwable {
		System.out.println("\n===================================================");
	    System.out.println("INFO :: SimplestReminderApp User sets default mobile capability");
	    Init_Default_Mobile_Capability();
	}

	@Given("^SimplestReminderApp User sets Android mobile capability which is appPackage and appActivity$")
	public void SimplestReminderApp_User_sets_Android_mobile_capability_which_is_appPackage_and_appActivity() throws Throwable {
		System.out.println("INFO :: SimplestReminderApp User sets Android mobile capability which is appPackage and appActivity");
	    Init_Android_Mobile_Capability();
	}

	@When("^SimplestReminderApp User starts app$")
	public void SimplestReminderApp_User_starts_app() throws Throwable {
		System.out.println("INFO :: SimplestReminderApp User starts app");
	    User_Starts_App();
	}

	@Then("^SimplestReminderApp User stops the app$")
	public void SimplestReminderApp_User_stops_the_app() throws Throwable {
		System.out.println("INFO :: SimplestReminderApp User stops the app");
	    User_Stops_App();
	}

}
