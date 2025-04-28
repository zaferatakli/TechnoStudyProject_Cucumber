Feature:  Techno Study - Blogs Page Test

  Background:
    Given The user navigates to the homepage
    And The user accepts cookies

  Scenario: User clicks on each blog post and returns to homepage
    When The user clicks on the Blogs link
    Then The user clicks each of the all blog posts and verifies the page loads correctly