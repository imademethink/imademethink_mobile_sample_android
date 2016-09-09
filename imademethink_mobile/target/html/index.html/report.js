$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/feature/App_SimplestReminder.feature");
formatter.feature({
  "id": "reminder-mobile-app-validation---just-reminder",
  "tags": [
    {
      "name": "@reminder",
      "line": 1
    },
    {
      "name": "@mobile",
      "line": 1
    },
    {
      "name": "@android",
      "line": 1
    },
    {
      "name": "@simplest_reminder",
      "line": 1
    }
  ],
  "description": "",
  "name": "Reminder mobile app validation - Just Reminder",
  "keyword": "Feature",
  "line": 2
});
formatter.scenario({
  "id": "reminder-mobile-app-validation---just-reminder;simplestreminderapp-app---operation-type---add-reminder",
  "description": "",
  "name": "SimplestReminderApp app - operation type - add reminder",
  "keyword": "Scenario",
  "line": 5,
  "type": "scenario",
  "comments": [
    {
      "value": "#\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d",
      "line": 4
    }
  ]
});
formatter.step({
  "name": "SimplestReminderApp User sets default mobile capability",
  "keyword": "Given ",
  "line": 6
});
formatter.step({
  "name": "SimplestReminderApp User sets Android mobile capability which is appPackage and appActivity",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "SimplestReminderApp User starts app",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "SimplestReminderApp Home screen elements to be shown",
  "keyword": "Then ",
  "line": 9
});
formatter.step({
  "name": "SimplestReminderApp User adds reminder with default setting",
  "keyword": "When ",
  "line": 10
});
formatter.step({
  "name": "SimplestReminderApp Same reminder should be shown in list",
  "keyword": "Then ",
  "line": 11
});
formatter.step({
  "name": "SimplestReminderApp User stops the app",
  "keyword": "And ",
  "line": 12
});
formatter.match({
  "location": "StepDefGeneral.SimplestReminderApp_User_sets_default_mobile_capability()"
});
formatter.result({
  "duration": 251279535,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGeneral.SimplestReminderApp_User_sets_Android_mobile_capability_which_is_appPackage_and_appActivity()"
});
formatter.result({
  "duration": 115058,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGeneral.SimplestReminderApp_User_starts_app()"
});
formatter.result({
  "duration": 13120210885,
  "status": "passed"
});
formatter.match({
  "location": "StepDefJustReminder.SimplestReminderApp_Home_screen_elements_to_be_shown()"
});
formatter.result({
  "duration": 2295955702,
  "status": "passed"
});
formatter.match({
  "location": "StepDefJustReminder.SimplestReminderApp_User_adds_reminder_with_default_setting()"
});
formatter.result({
  "duration": 10893607584,
  "status": "passed"
});
formatter.match({
  "location": "StepDefJustReminder.SimplestReminderApp_Same_reminder_should_be_shown_in_list()"
});
formatter.result({
  "duration": 71726267,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGeneral.SimplestReminderApp_User_stops_the_app()"
});
formatter.result({
  "duration": 2075082187,
  "status": "passed"
});
formatter.scenario({
  "id": "reminder-mobile-app-validation---just-reminder;simplestreminderapp-app---operation-type---edit-reminder",
  "description": "",
  "name": "SimplestReminderApp app - operation type - edit reminder",
  "keyword": "Scenario",
  "line": 15,
  "type": "scenario",
  "comments": [
    {
      "value": "#\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d",
      "line": 14
    }
  ]
});
formatter.step({
  "name": "SimplestReminderApp User sets default mobile capability",
  "keyword": "Given ",
  "line": 16
});
formatter.step({
  "name": "SimplestReminderApp User sets Android mobile capability which is appPackage and appActivity",
  "keyword": "And ",
  "line": 17
});
formatter.step({
  "name": "SimplestReminderApp User starts app",
  "keyword": "When ",
  "line": 18
});
formatter.step({
  "name": "SimplestReminderApp Home screen elements to be shown",
  "keyword": "Then ",
  "line": 19
});
formatter.step({
  "name": "SimplestReminderApp User edits already added reminder by changing text",
  "keyword": "When ",
  "line": 20
});
formatter.step({
  "name": "SimplestReminderApp Edited reminder should be shown in list",
  "keyword": "Then ",
  "line": 21
});
formatter.step({
  "name": "SimplestReminderApp User stops the app",
  "keyword": "And ",
  "line": 22
});
formatter.match({
  "location": "StepDefGeneral.SimplestReminderApp_User_sets_default_mobile_capability()"
});
formatter.result({
  "duration": 387517,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGeneral.SimplestReminderApp_User_sets_Android_mobile_capability_which_is_appPackage_and_appActivity()"
});
formatter.result({
  "duration": 144571,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGeneral.SimplestReminderApp_User_starts_app()"
});
formatter.result({
  "duration": 11456928653,
  "status": "passed"
});
formatter.match({
  "location": "StepDefJustReminder.SimplestReminderApp_Home_screen_elements_to_be_shown()"
});
formatter.result({
  "duration": 1948045688,
  "status": "passed"
});
formatter.match({
  "location": "StepDefJustReminder.SimplestReminderApp_User_edits_user_edits_already_added_reminder_by_changing_text()"
});
formatter.result({
  "duration": 15164648382,
  "status": "passed"
});
formatter.match({
  "location": "StepDefJustReminder.SimplestReminderApp_Edited_reminder_should_be_shown_in_list()"
});
formatter.result({
  "duration": 104766210,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGeneral.SimplestReminderApp_User_stops_the_app()"
});
formatter.result({
  "duration": 1695457746,
  "status": "passed"
});
formatter.scenario({
  "id": "reminder-mobile-app-validation---just-reminder;simplestreminderapp-app---operation-type---delete-reminder",
  "description": "",
  "name": "SimplestReminderApp app - operation type - delete reminder",
  "keyword": "Scenario",
  "line": 25,
  "type": "scenario",
  "comments": [
    {
      "value": "#\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d",
      "line": 24
    }
  ]
});
formatter.step({
  "name": "SimplestReminderApp User sets default mobile capability",
  "keyword": "Given ",
  "line": 26
});
formatter.step({
  "name": "SimplestReminderApp User sets Android mobile capability which is appPackage and appActivity",
  "keyword": "And ",
  "line": 27
});
formatter.step({
  "name": "SimplestReminderApp User starts app",
  "keyword": "When ",
  "line": 28
});
formatter.step({
  "name": "SimplestReminderApp Home screen elements to be shown",
  "keyword": "Then ",
  "line": 29
});
formatter.step({
  "name": "SimplestReminderApp User deletes already added reminder by changing text",
  "keyword": "When ",
  "line": 30
});
formatter.step({
  "name": "SimplestReminderApp Deleted reminder should not be shown in list",
  "keyword": "Then ",
  "line": 31
});
formatter.step({
  "name": "SimplestReminderApp User stops the app",
  "keyword": "And ",
  "line": 32
});
formatter.match({
  "location": "StepDefGeneral.SimplestReminderApp_User_sets_default_mobile_capability()"
});
formatter.result({
  "duration": 198892,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGeneral.SimplestReminderApp_User_sets_Android_mobile_capability_which_is_appPackage_and_appActivity()"
});
formatter.result({
  "duration": 54321,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGeneral.SimplestReminderApp_User_starts_app()"
});
formatter.result({
  "duration": 11307403726,
  "status": "passed"
});
formatter.match({
  "location": "StepDefJustReminder.SimplestReminderApp_Home_screen_elements_to_be_shown()"
});
formatter.result({
  "duration": 2370288089,
  "status": "passed"
});
formatter.match({
  "location": "StepDefJustReminder.SimplestReminderApp_User_deletes_already_added_reminder()"
});
formatter.result({
  "duration": 23923182538,
  "status": "passed"
});
formatter.match({
  "location": "StepDefJustReminder.SimplestReminderApp_Same_Deleted_reminder_should_not_be_shown_in_list()"
});
formatter.result({
  "duration": 159968,
  "status": "passed"
});
formatter.match({
  "location": "StepDefGeneral.SimplestReminderApp_User_stops_the_app()"
});
formatter.result({
  "duration": 1751328296,
  "status": "passed"
});
});