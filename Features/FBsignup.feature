Feature: Validate FB signup

@fbsignup
Scenario Outline: FB creating a new account

Given   User go to fb webpage and clicks on create new account

When    User types "<first_name>" and "<last_name>" and "<email_address>" and "<email_address>" and "<password>"

When    User Choose month, day and year

When    User select gender

When    User clicks Signup option

Then    User will able go to login page

Examples:
|first_name|last_name|email_address|email_address|password|
|fy|dola|fydola@gmail.com|fydola@gmail.com|abcd@12|