
@paralel2

Feature: US301 webdriveruniversity testi

  Scenario: webdriveruniversity testi

    Given kullanici "webURL" sayfasina gider
    And go to login portal
    Then click on the login portal button
    And switch to new window
    Then write a "username" and a "password"
    And click on the login button
    Then verify "validation failed"
    And Click on pop-up ok
    Then Go back the first page
    #And Verify the first page

