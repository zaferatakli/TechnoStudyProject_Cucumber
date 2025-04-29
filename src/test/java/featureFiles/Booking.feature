Feature:  Techno Study - Booking Application Form

  Background:
    Given The user navigates to the homepage
    And The user accepts cookies

  Scenario: User submits a booking request successfully
    And the Apply Now button is clearly visible

    When the user clicks the Apply Now button
    Then the application form page is displayed

    When the user fills in the form with the following details:
    And the user click the terms of use checkbox
    And the user clicks the Book a Call button
    Then a confirmation message is displayed