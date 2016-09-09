@reminder @mobile @android @simplest_reminder
Feature: Reminder mobile app validation - Just Reminder 

#==================================================================================
  Scenario: SimplestReminderApp app - operation type - add reminder
    Given   SimplestReminderApp User sets default mobile capability
    And     SimplestReminderApp User sets Android mobile capability which is appPackage and appActivity
    When    SimplestReminderApp User starts app
    Then    SimplestReminderApp Home screen elements to be shown
    When    SimplestReminderApp User adds reminder with default setting
    Then    SimplestReminderApp Same reminder should be shown in list
    And     SimplestReminderApp User stops the app

#==================================================================================
  Scenario: SimplestReminderApp app - operation type - edit reminder
    Given   SimplestReminderApp User sets default mobile capability
    And     SimplestReminderApp User sets Android mobile capability which is appPackage and appActivity
    When    SimplestReminderApp User starts app
    Then    SimplestReminderApp Home screen elements to be shown
    When    SimplestReminderApp User edits already added reminder by changing text
    Then    SimplestReminderApp Edited reminder should be shown in list
    And     SimplestReminderApp User stops the app

#==================================================================================
  Scenario: SimplestReminderApp app - operation type - delete reminder
    Given   SimplestReminderApp User sets default mobile capability
    And     SimplestReminderApp User sets Android mobile capability which is appPackage and appActivity
    When    SimplestReminderApp User starts app
    Then    SimplestReminderApp Home screen elements to be shown
    When    SimplestReminderApp User deletes already added reminder by changing text
    Then    SimplestReminderApp Deleted reminder should not be shown in list
    And     SimplestReminderApp User stops the app
