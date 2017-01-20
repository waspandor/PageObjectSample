Feature: test

  @t
  Scenario: test
    Given The user navigates to the BBC homepage
    Then clicks on the sports page
    Then test
    Then click on the News page


  @te
  Scenario: Valid login
    Given The user navigates to the BBC homepage
    When clicks on the sign in link
    And enters valid username
    And enters valid password
    And clicks the sign in button
    When clicks on the sign in link
    And navigate to the user settings page
    Then verify the correct user is logged in

    @test
    Scenario: Forgotten password flow
      Given The user navigates to the BBC homepage
      When clicks on the sign in link
      Then clicks on the forgotten password link
      Then follows the link from within the received email
     # Then enters the new password
