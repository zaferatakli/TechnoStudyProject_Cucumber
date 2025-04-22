Feature:  Techno Study - Booking Application Form

  Scenario: User submits a booking request successfully
    Given the user navigate the website
    And the user accepts cookies
    And the Apply Now button is clearly visible

    When the user clicks the Apply Now button
    Then the application form page is displayed

    When the user fills in the form with the following details:
    And the user click the terms of use checkbox
    And the user clicks the Book a Call button
    Then a confirmation message is displayed
