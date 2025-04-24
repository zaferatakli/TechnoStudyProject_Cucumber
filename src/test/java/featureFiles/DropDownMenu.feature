Feature: TechnoStudy - Programs dropdown menu on homepage

  Scenario: User can access all course pages from the Programs dropdown
    Given The user navigates to the homepage
    And The user accepts cookies
    When The user hovers over the Programs menu
    Then The user should be see the all programs link and selects each page and navigated to the correct course page