Feature: Techno Study - Campus Sing in Button Test

  Background:
    Given The user navigates to the homepage
    And The user accepts cookies

  Scenario: First load - verify homepage and accept cookies
    And The logo should be visible and clickable

    When The user clicks on the sign in button
    Then The user should be redirected to the sign in page of the Campus