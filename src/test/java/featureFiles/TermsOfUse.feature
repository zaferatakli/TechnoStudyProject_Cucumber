Feature: Techno Study - Apply Now Form Terms Of Use Link Test

  Background:
    Given The user navigates to the homepage
    And The user accepts cookies

  Scenario: Check Terms of Use link inside Apply Now form

    When The user clicks the Apply Now button
    And The user sees the form

    And The user clicks the Terms of Use link
    Then The user should be redirected to the Terms of Use page
    And The page title should be Terms of Use

