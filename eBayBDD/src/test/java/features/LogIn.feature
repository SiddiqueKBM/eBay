@SmokeTest
Feature: Login

Scenario: Login with invalid credentials
 Given  User is in login Page

 When   Enter invalid email and password from Data Table
 | email                | passCode  |
 | mudhuratan@gmail.com | robikumar |

 Then   Error message appear