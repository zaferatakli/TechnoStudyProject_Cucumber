Feature: Techno Study - Homepage and Menu Navigation Test

  Scenario: First load - verify homepage and accept cookies
    Given The user navigates to the homepage
    And The user accepts cookies
    And The logo should be visible and clickable

    When The user clicks on the Logo
    Then The user should be redirected to the homepage

    Then The user clicks on the Programs > SDET link and should be redirected to the correct page
    And The user should return to the homepage by clicking the logo

    Then The user clicks on the Programs > Data Science link and should be redirected to the correct page
    And The user should return to the homepage by clicking the logo

    Then The user clicks on the Programs > AI link and should be redirected to the correct page
    And The user should return to the homepage by clicking the logo

    Then The user clicks on the Programs > Android Developer link and should be redirected to the correct page
    And The user should return to the homepage by clicking the logo

    Then The user clicks on the Programs > Masters Program link and should be redirected to the correct page
    And The user should return to the homepage by clicking the logo

    Then The user clicks on the About Us link and should be redirected to the correct page
    And The user should return to the homepage by clicking the logo

    Then The user clicks on the Work With Us link and should be redirected to the correct page
    And The user should return to the homepage by clicking the logo

    Then The user clicks on the Apply Now button and should be redirected to the correct page
    And The user should return to the homepage by clicking the logo

    Then The user clicks on the Coding Bootcamp link and should be redirected to the correct page
    And The user should return to the homepage by clicking the logo

    When The user scrolls down the page
    Then The user clicks on the Terms of Use link and should be redirected to the correct page
    And The user should return to the homepage by clicking the logo

    When The user scrolls down the page
    Then The user clicks on the Privacy Policy link and should be redirected to the correct page
    And The user should return to the homepage by clicking the logo

    When The user scrolls down the page
    Then The user clicks on the Cookies Policy link and should be redirected to the correct page
    And The user should return to the homepage by clicking the logo

    When The user clicks on the Blogs link
    Then The user clicks each of the all blog posts and verifies the page loads correctly
    And The user should return to the homepage by clicking the logo after each blog check
