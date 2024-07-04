@Sanity

Feature: filling forms 

@Test
Scenario Outline: login with different creds

Given the user is on valid page
When provided <'username'> and <'password'>
Then user should sucessfully login
And click on logout


Examples: 

|username|password|
|Neelima@gmail.com|Neelima@1234*|
|mani@gmail.com|mani|
|abcdef@gmail.com|next|