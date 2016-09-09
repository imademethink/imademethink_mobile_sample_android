package com.imademethink_androidAppAutomation;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefJustReminder extends SimplestReminder_Init{

	@Then("^SimplestReminderApp Home screen elements to be shown$")
	public void SimplestReminderApp_Home_screen_elements_to_be_shown() throws Throwable {
		System.out.println("INFO :: SimplestReminderApp Home screen elements to be shown");
		Home_Screen_Element_ToBe_Shown();
	}

	@When("^SimplestReminderApp User adds reminder with default setting$")
	public void SimplestReminderApp_User_adds_reminder_with_default_setting() throws Throwable {
		System.out.println("INFO :: SimplestReminderApp User adds reminder with default setting");
		User_adds_reminder_with_default_setting();
	}
	
	@Then("^SimplestReminderApp Same reminder should be shown in list$")
	public void SimplestReminderApp_Same_reminder_should_be_shown_in_list() throws Throwable {
		System.out.println("INFO :: SimplestReminderApp Same reminder should be shown in list");
		Same_reminder_should_be_shown_in_list();
	}
	
	@When("^SimplestReminderApp User edits already added reminder by changing text$")
	public void SimplestReminderApp_User_edits_user_edits_already_added_reminder_by_changing_text() throws Throwable {
		System.out.println("INFO :: SimplestReminderApp User edits already added reminder by changing text");
		User_edits_user_edits_already_added_reminder_by_changing_text();
	}
	
	@Then("^SimplestReminderApp Edited reminder should be shown in list$")
	public void SimplestReminderApp_Edited_reminder_should_be_shown_in_list() throws Throwable {
		System.out.println("INFO :: SimplestReminderApp Edited reminder should be shown in list");
		Edited_reminder_should_be_shown_in_list();
	}
	
	@When("^SimplestReminderApp User deletes already added reminder by changing text$")
	public void SimplestReminderApp_User_deletes_already_added_reminder() throws Throwable {
		System.out.println("INFO :: SimplestReminderApp User deletes already added reminder by changing text");
		User_deletes_already_added_reminder();
	}
	
	@Then("^SimplestReminderApp Deleted reminder should not be shown in list$")
	public void SimplestReminderApp_Same_Deleted_reminder_should_not_be_shown_in_list() throws Throwable {
		System.out.println("INFO :: SimplestReminderApp Same Deleted reminder should not be shown in list");
	}
	
}