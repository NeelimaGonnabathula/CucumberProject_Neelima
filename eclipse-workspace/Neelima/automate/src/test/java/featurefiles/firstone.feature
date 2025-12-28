@Regression

Feature: Testing login

@ValidCreds
Scenario: Valid creds

Given user is on valid screen
When entered valid creds username and password
Then user should login successfully


@InvalidCreds
Scenario: InValid creds

Given user is on valid screen
When entered invalid creds username and password
Then user should not login successfully