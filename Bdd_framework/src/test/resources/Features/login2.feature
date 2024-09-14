Feature: User login functionality

  Scenario Outline: Login with valid credentials for different users
    Given the user is on the login page
    When the user logs in with the following credentials:
      | username          | password          |
      | <username>        | <password>        |
    Then the user should be redirected to the dashboard

    Examples:
      | username      | password   |
      | user1         | pass123    |
      | adminUser     | adminPass  |
      | guestUser     | guest123   |
      | john.doe      | johnpass   |
      | jane.doe      | janepass   |